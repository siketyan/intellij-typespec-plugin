package jp.s6n.idea.typespec.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.javascript.nodejs.interpreter.NodeCommandLineConfigurator
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreter
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerDescriptor
import jp.s6n.idea.typespec.lang.TypeSpecFileType
import jp.s6n.idea.typespec.lang.TypeSpecLanguage

@Suppress("UnstableApiUsage")
class TypeSpecLspServerDescriptor(
    project: Project,
    root: VirtualFile,
    version: String,
    private val interpreter: NodeJsInterpreter,
    private val tspServerFile: VirtualFile
) : LspServerDescriptor(project, "TypeSpec $version", root) {
    override fun isSupportedFile(file: VirtualFile) = file.fileType == TypeSpecFileType

    override fun getLanguageId(file: VirtualFile) = TypeSpecLanguage.id

    override fun createCommandLine() = GeneralCommandLine().also {
        it.addParameters(tspServerFile.path, "--stdio")
        NodeCommandLineConfigurator.find(interpreter).configure(it)
    }
}
