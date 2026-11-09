package jp.s6n.idea.typespec.lsp

import com.intellij.notification.Notification
import com.intellij.notification.Notifications
import com.intellij.platform.lsp.api.LspClientDescriptor
import com.intellij.platform.lsp.api.LspIntegrationProvider
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class TypeSpecLspIntegrationProviderTest : BasePlatformTestCase() {
    private val startedDescriptors = mutableListOf<LspClientDescriptor>()
    private val notifications = mutableListOf<Notification>()

    private val clientStarter = LspIntegrationProvider.LspClientStarter { startedDescriptors.add(it) }

    override fun setUp() {
        super.setUp()
        setUpLocalNodeInterpreter(project, testRootDisposable)

        project.messageBus.connect(testRootDisposable).subscribe(
            Notifications.TOPIC,
            object : Notifications {
                override fun notify(notification: Notification) {
                    notifications.add(notification)
                }
            },
        )
    }

    fun testStartsClientWhenCompilerIsInstalled() {
        myFixture.addFileToProject("node_modules/@typespec/compiler/cmd/tsp-server.js", "")
        val file = myFixture.addFileToProject("main.tsp", "").virtualFile

        TypeSpecLspIntegrationProvider().fileOpened(project, file, clientStarter)

        val descriptor = startedDescriptors.single()
        assertInstanceOf(descriptor, TypeSpecLspClientDescriptor::class.java)
        assertEquals(file.parent, descriptor.roots.single())
        assertEmpty(notifications)
    }

    fun testFindsCompilerInAncestorDirectory() {
        myFixture.addFileToProject("node_modules/@typespec/compiler/cmd/tsp-server.js", "")
        val file = myFixture.addFileToProject("specs/nested/main.tsp", "").virtualFile

        TypeSpecLspIntegrationProvider().fileOpened(project, file, clientStarter)

        val descriptor = startedDescriptors.single()
        assertEquals(file.parent.parent.parent, descriptor.roots.single())
    }

    fun testStartsClientForTspConfig() {
        myFixture.addFileToProject("node_modules/@typespec/compiler/cmd/tsp-server.js", "")
        val file = myFixture.addFileToProject("tspconfig.yaml", "").virtualFile

        TypeSpecLspIntegrationProvider().fileOpened(project, file, clientStarter)

        assertSize(1, startedDescriptors)
    }

    fun testNotifiesWhenCompilerIsNotInstalled() {
        val file = myFixture.addFileToProject("main.tsp", "").virtualFile

        TypeSpecLspIntegrationProvider().fileOpened(project, file, clientStarter)

        assertEmpty(startedDescriptors)
        assertEquals("TypeSpec is not installed", notifications.single().title)
    }

    fun testIgnoresUnsupportedFiles() {
        myFixture.addFileToProject("node_modules/@typespec/compiler/cmd/tsp-server.js", "")
        val file = myFixture.addFileToProject("main.ts", "").virtualFile

        TypeSpecLspIntegrationProvider().fileOpened(project, file, clientStarter)

        assertEmpty(startedDescriptors)
        assertEmpty(notifications)
    }
}
