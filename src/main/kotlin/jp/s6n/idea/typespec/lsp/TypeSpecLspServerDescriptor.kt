package jp.s6n.idea.typespec.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.javascript.nodejs.interpreter.NodeCommandLineConfigurator
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreter
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.StandardFileSystems
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.platform.lsp.api.LspServerDescriptor
import com.intellij.platform.lsp.api.customization.LspSemanticTokensSupport
import com.intellij.util.io.URLUtil
import jp.s6n.idea.typespec.lang.TypeSpecFileType
import org.eclipse.lsp4j.SemanticTokenTypes
import org.jetbrains.yaml.YAMLFileType

class TypeSpecLspServerDescriptor(
    project: Project,
    root: VirtualFile,
    interpreter: NodeJsInterpreter,
    private val tspServerFile: VirtualFile
) : LspServerDescriptor(project, "TypeSpec", root) {
    private val commandLineConfigurator = NodeCommandLineConfigurator.find(interpreter)

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
        commandLineConfigurator.configure(it)
    }

    // Overriding getFileUri instead of getFilePath, since getFilePath is an internal API since 2026.3.
    override fun getFileUri(file: VirtualFile): String {
        val remotePath = commandLineConfigurator.convertLocalPathToRemote(file.path)
        if (remotePath == file.path) {
            // Let the platform handle local paths (e.g. Windows drive letters).
            return super.getFileUri(file)
        }

        val url = VirtualFileManager.constructUrl(StandardFileSystems.FILE_PROTOCOL, URLUtil.encodePath(remotePath))
        return VfsUtil.toUri(url)?.toString() ?: super.getFileUri(file)
    }

    companion object {
        fun isSupportedFile(file: VirtualFile) =
            TypeSpecFileType.isMyFile(file) ||
                (file.fileType == YAMLFileType.YML && file.name == "tspconfig.yaml")
    }
}
