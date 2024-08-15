package jp.s6n.idea.typespec.lsp

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerSupportProvider

@Suppress("UnstableApiUsage")
class TypeSpecLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(
        project: Project,
        file: VirtualFile,
        serverStarter: LspServerSupportProvider.LspServerStarter
    ) {
        if (file.extension == "tsp") {
            serverStarter.ensureServerStarted(TypeSpecLspServerDescriptor(project))
        }
    }
}
