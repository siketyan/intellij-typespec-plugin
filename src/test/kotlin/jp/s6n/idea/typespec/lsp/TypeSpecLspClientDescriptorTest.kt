package jp.s6n.idea.typespec.lsp

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.platform.lsp.api.customization.LspSemanticTokensSupport
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import org.eclipse.lsp4j.SemanticTokenTypes

class TypeSpecLspClientDescriptorTest : BasePlatformTestCase() {
    private fun createDescriptor(): TypeSpecLspClientDescriptor {
        val interpreter = setUpLocalNodeInterpreter(project, testRootDisposable)
        val serverFile = myFixture.addFileToProject("node_modules/@typespec/compiler/cmd/tsp-server.js", "").virtualFile

        return TypeSpecLspClientDescriptor(project, myFixture.tempDirFixture.getFile(".")!!, interpreter, serverFile)
    }

    fun testSupportedFiles() {
        val tsp = myFixture.addFileToProject("main.tsp", "").virtualFile
        val tspConfig = myFixture.addFileToProject("tspconfig.yaml", "").virtualFile
        val otherYaml = myFixture.addFileToProject("other.yaml", "").virtualFile
        val ts = myFixture.addFileToProject("main.ts", "").virtualFile

        assertTrue(TypeSpecLspClientDescriptor.isSupportedFile(tsp))
        assertTrue(TypeSpecLspClientDescriptor.isSupportedFile(tspConfig))
        assertFalse(TypeSpecLspClientDescriptor.isSupportedFile(otherYaml))
        assertFalse(TypeSpecLspClientDescriptor.isSupportedFile(ts))
    }

    fun testLanguageId() {
        val descriptor = createDescriptor()
        val tsp = myFixture.addFileToProject("main.tsp", "").virtualFile

        assertEquals("typespec", descriptor.getLanguageId(tsp))
    }

    fun testCommandLineRunsTspServerViaStdio() {
        val descriptor = createDescriptor()

        val parameters = descriptor.createCommandLine().parametersList.parameters
        assertTrue(parameters.toString(), parameters.any { it.endsWith("@typespec/compiler/cmd/tsp-server.js") })
        assertTrue(parameters.toString(), parameters.contains("--stdio"))
    }

    fun testSemanticTokensCustomization() {
        val customizer = createDescriptor().lspCustomization.semanticTokensCustomizer
        assertInstanceOf(customizer, LspSemanticTokensSupport::class.java)
        customizer as LspSemanticTokensSupport

        assertEquals(DefaultLanguageHighlighterColors.CLASS_NAME, customizer.getTextAttributesKey(SemanticTokenTypes.Type, emptyList()))
        assertEquals(DefaultLanguageHighlighterColors.CLASS_NAME, customizer.getTextAttributesKey(SemanticTokenTypes.Struct, emptyList()))
        assertNull(customizer.getTextAttributesKey(SemanticTokenTypes.Comment, emptyList()))
        assertNull(customizer.getTextAttributesKey(SemanticTokenTypes.Decorator, emptyList()))
    }
}
