package jp.s6n.idea.typespec.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.javascript.nodejs.interpreter.NodeCommandLineConfigurator
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreter
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerDescriptor
import jp.s6n.idea.typespec.lang.TypeSpecFileType
import org.jetbrains.yaml.YAMLFileType

@Suppress("UnstableApiUsage")
class TypeSpecLspServerDescriptor(
    project: Project,
    root: VirtualFile,
    version: String,
    private val interpreter: NodeJsInterpreter,
    private val tspServerFile: VirtualFile
) : LspServerDescriptor(project, "TypeSpec $version", root) {
    override fun isSupportedFile(file: VirtualFile) = TypeSpecLspServerDescriptor.isSupportedFile(file)

    override fun getLanguageId(file: VirtualFile) = "typespec"

    override fun createCommandLine() = GeneralCommandLine().also {
        it.addParameters(tspServerFile.path, "--stdio")
        NodeCommandLineConfigurator.find(interpreter).configure(it)
    }

    companion object {
        fun isSupportedFile(file: VirtualFile) =
            file.fileType == TypeSpecFileType ||
                (file.fileType == YAMLFileType.YML && file.name == "tspconfig.yaml")
    }
}
