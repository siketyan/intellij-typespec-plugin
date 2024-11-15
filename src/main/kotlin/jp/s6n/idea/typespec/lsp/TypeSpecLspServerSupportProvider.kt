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

        val packageJson = findNearestPackageJson(file) ?: return Notifications.Bus.notify(
            Notification(
                "TypeSpec",
                "Missing package.json",
                "Could not find package.json in the project.",
                NotificationType.WARNING
            ), project
        )

        val packageDir = packageJson.parent ?: return
        val tspServer = findTspServer(packageJson.parent) ?: return Notifications.Bus.notify(
            Notification(
                "TypeSpec",
                "TypeSpec is not installed",
                "Could not find @typespec/compiler in the current package.",
                NotificationType.WARNING
            )
        )

        serverStarter.ensureServerStarted(TypeSpecLspServerDescriptor(project, packageDir, tspServer))
    }

    private fun findNearestPackageJson(file: VirtualFile): VirtualFile? {
        val directory = file.parent ?: return null
        return directory.findChild("package.json") ?: findNearestPackageJson(directory)
    }

    private fun findTspServer(directory: VirtualFile): VirtualFile? =
        directory.findFile("node_modules/@typespec/compiler/cmd/tsp-server.js")
}
