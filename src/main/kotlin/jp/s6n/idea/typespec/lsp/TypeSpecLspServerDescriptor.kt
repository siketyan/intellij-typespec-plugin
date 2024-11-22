package jp.s6n.idea.typespec.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.javascript.nodejs.interpreter.NodeCommandLineConfigurator
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreter
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerDescriptor
import com.intellij.platform.lsp.api.customization.LspSemanticTokensSupport
import org.eclipse.lsp4j.SemanticTokenTypes
import org.jetbrains.plugins.textmate.TextMateFileType
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
                SemanticTokenTypes.Type -> DefaultLanguageHighlighterColors.CLASS_NAME
                SemanticTokenTypes.Struct -> DefaultLanguageHighlighterColors.CLASS_NAME
                SemanticTokenTypes.Macro -> DefaultLanguageHighlighterColors.METADATA
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
            (file.fileType == TextMateFileType.INSTANCE && file.extension == "tsp") ||
                (file.fileType == YAMLFileType.YML && file.name == "tspconfig.yaml")
    }
}
