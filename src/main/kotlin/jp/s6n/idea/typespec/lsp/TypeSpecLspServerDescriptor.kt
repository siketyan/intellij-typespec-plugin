package jp.s6n.idea.typespec.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.javascript.nodejs.interpreter.NodeCommandLineConfigurator
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreter
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerDescriptor
import com.intellij.platform.lsp.api.customization.LspSemanticTokensSupport
import jp.s6n.idea.typespec.lang.TypeSpecFileType
import org.eclipse.lsp4j.SemanticTokenTypes
import org.jetbrains.yaml.YAMLFileType

@Suppress("UnstableApiUsage")
class TypeSpecLspServerDescriptor(
    project: Project,
    root: VirtualFile,
    version: String,
    private val interpreter: NodeJsInterpreter,
    private val tspServerFile: VirtualFile
) : LspServerDescriptor(project, "TypeSpec $version", root) {
    override val lspSemanticTokensSupport = object : LspSemanticTokensSupport() {
        override fun getTextAttributesKey(tokenType: String, modifiers: List<String>) =
            when (tokenType) {
                // Changing colours for better appearance and consistency in IntelliJ IDE
                SemanticTokenTypes.Type,
                SemanticTokenTypes.Struct -> DefaultLanguageHighlighterColors.CLASS_NAME

                // Skip these tokens as they are already well handled by TextMate
                SemanticTokenTypes.Macro,
                SemanticTokenTypes.Decorator,
                SemanticTokenTypes.Operator,
                SemanticTokenTypes.Comment -> null

                else -> super.getTextAttributesKey(tokenType, modifiers)
            }
    }

    override fun isSupportedFile(file: VirtualFile) = TypeSpecLspServerDescriptor.isSupportedFile(file)

    override fun getLanguageId(file: VirtualFile) = "typespec"

    override fun createCommandLine() = GeneralCommandLine().also {
        it.addParameters(tspServerFile.path, "--stdio")
        NodeCommandLineConfigurator.find(interpreter).configure(it)
    }

    companion object {
        fun isSupportedFile(file: VirtualFile) =
            TypeSpecFileType.isMyFile(file) ||
                (file.fileType == YAMLFileType.YML && file.name == "tspconfig.yaml")
    }
}
