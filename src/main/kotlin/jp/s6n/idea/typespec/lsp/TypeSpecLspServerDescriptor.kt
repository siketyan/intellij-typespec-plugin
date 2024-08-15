package jp.s6n.idea.typespec.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

@Suppress("UnstableApiUsage")
class TypeSpecLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "TypeSpec") {
    override fun isSupportedFile(file: VirtualFile) = file.extension == "tsp"
    override fun createCommandLine() = GeneralCommandLine("tsp-server", "--stdio")
}
