package jp.s6n.idea.typespec.lsp

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.findFile
import com.intellij.platform.lsp.api.LspServerSupportProvider
import jp.s6n.idea.typespec.lang.TypeSpecFileType

@Suppress("UnstableApiUsage")
class TypeSpecLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(
        project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter
    ) {
        if (file.fileType != TypeSpecFileType) return

        val descriptor = findTspServer(project, file.parent ?: return) ?: return Notifications.Bus.notify(
            Notification(
                "TypeSpec",
                "TypeSpec is not installed",
                "Could not find @typespec/compiler in the current directory.",
                NotificationType.WARNING
            )
        )

        serverStarter.ensureServerStarted(descriptor)
    }

    private fun findTspServer(project: Project, directory: VirtualFile): TypeSpecLspServerDescriptor? {
        val tspServerFile = directory.findFile("node_modules/@typespec/compiler/cmd/tsp-server.js")
            ?: return findTspServer(project, directory.parent ?: return null)

        return TypeSpecLspServerDescriptor(project, directory, tspServerFile)
    }
}
