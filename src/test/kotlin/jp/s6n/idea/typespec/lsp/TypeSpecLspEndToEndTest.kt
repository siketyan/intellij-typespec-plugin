package jp.s6n.idea.typespec.lsp

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.vfs.LocalFileSystem
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspClient
import com.intellij.platform.lsp.api.LspClientManager
import com.intellij.platform.lsp.api.LspServerState
import com.intellij.testFramework.PlatformTestUtil
import com.intellij.testFramework.PsiTestUtil
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import jp.s6n.idea.typespec.folding.TypeSpecFoldingBuilder
import jp.s6n.idea.typespec.lang.TypeSpecStructureViewFactory
import org.junit.Assume.assumeTrue
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.absolute
import kotlin.io.path.copyTo
import kotlin.io.path.createSymbolicLinkPointingTo
import kotlin.io.path.exists
import kotlin.io.path.listDirectoryEntries
import kotlin.io.path.name

/**
 * End-to-end tests with the real tsp-server from the fixture project in src/test/testData/tsp-project.
 *
 * Requires `npm ci` in the fixture project. Without it, the tests are skipped locally but fail on CI.
 */
class TypeSpecLspEndToEndTest : BasePlatformTestCase() {
    private lateinit var projectDir: VirtualFile

    override fun setUp() {
        super.setUp()

        val fixtureDir = Path.of("src/test/testData/tsp-project").absolute()
        val nodeModules = fixtureDir.resolve("node_modules")
        if (System.getenv("CI") == null) {
            assumeTrue("Run `npm ci` in $fixtureDir to enable LSP end-to-end tests", nodeModules.exists())
        } else {
            assertTrue("Run `npm ci` in $fixtureDir before running tests on CI", nodeModules.exists())
        }

        setUpLocalNodeInterpreter(project, testRootDisposable)

        // Copy the fixture project so that tests can freely modify it, sharing node_modules via a symlink.
        val tempDir = Files.createTempDirectory("tsp-project")
        fixtureDir.listDirectoryEntries()
            .filter { Files.isRegularFile(it) }
            .forEach { it.copyTo(tempDir.resolve(it.name)) }
        tempDir.resolve("node_modules").createSymbolicLinkPointingTo(nodeModules)

        projectDir = LocalFileSystem.getInstance().refreshAndFindFileByNioFile(tempDir)!!
        PsiTestUtil.addContentRoot(module, projectDir)
    }

    override fun tearDown() {
        try {
            if (::projectDir.isInitialized) {
                LspClientManager.getInstance(project).stopClients(TypeSpecLspIntegrationProvider::class.java)
                PsiTestUtil.removeContentEntry(module, projectDir)
            }
        } catch (e: Throwable) {
            addSuppressedException(e)
        } finally {
            super.tearDown()
        }
    }

    private fun openAndStartClient(fileName: String): LspClient {
        val file = projectDir.findChild(fileName)!!
        myFixture.configureFromExistingVirtualFile(file)
        LspClientManager.getInstance(project).startClientsIfNeeded(TypeSpecLspIntegrationProvider::class.java)

        var client: LspClient? = null
        waitUntil("tsp-server to start") {
            client = LspClientUtil.getClientManager(project).findClientForFile(file)
            client?.state == LspServerState.Running
        }

        return client!!
    }

    private fun waitUntil(description: String, timeoutMs: Long = 60_000, condition: () -> Boolean) {
        val deadline = System.currentTimeMillis() + timeoutMs
        while (!condition()) {
            if (System.currentTimeMillis() > deadline) fail("Timed out waiting for $description")
            PlatformTestUtil.dispatchAllEventsInIdeEventQueue()
            Thread.sleep(100)
        }
    }

    fun testServerStarts() {
        val client = openAndStartClient("main.tsp")

        assertInstanceOf(client.descriptor, TypeSpecLspClientDescriptor::class.java)
        assertEquals(projectDir, client.descriptor.roots.single())
        assertNotNull(client.initializeResult?.capabilities)
    }

    fun testStructureView() {
        openAndStartClient("main.tsp")

        val builder = TypeSpecStructureViewFactory().getStructureViewBuilder(myFixture.file)!!
        val model = builder.createStructureViewModel(myFixture.editor)
        try {
            fun names(element: StructureViewTreeElement): List<String> =
                element.children.flatMap {
                    it as StructureViewTreeElement
                    listOfNotNull(it.presentation.presentableText) + names(it)
                }

            val names = names(model.root)
            assertContainsElements(names, "Demo", "Widget", "id", "weight", "Color", "Red", "Blue", "getWidget")
        } finally {
            model.dispose()
        }
    }

    fun testFolding() {
        openAndStartClient("main.tsp")

        val text = myFixture.editor.document.text
        val regions = TypeSpecFoldingBuilder()
            .buildFoldRegions(myFixture.file, myFixture.editor.document, false)
            .map { it.range.substring(text) }

        assertContainsElements(
            regions,
            "model Widget {\n  id: string;\n  weight: int32;\n}",
            "enum Color {\n  Red,\n  Blue,\n}",
        )
    }

    fun testDiagnostics() {
        openAndStartClient("main.tsp")

        WriteCommandAction.runWriteCommandAction(project) {
            val document = myFixture.editor.document
            document.insertString(document.textLength, "\nmodel Broken {\n  value: UnknownType;\n}\n")
        }

        var errors: List<HighlightInfo> = emptyList()
        waitUntil("diagnostics from tsp-server") {
            errors = myFixture.doHighlighting(HighlightSeverity.ERROR)
            errors.isNotEmpty()
        }

        assertTrue(errors.toString(), errors.any { it.description.contains("UnknownType") })
    }
}
