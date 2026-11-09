package jp.s6n.idea.typespec.lsp

import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreter
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreterManager
import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.findDirectory
import com.intellij.openapi.vfs.findFile
import com.intellij.platform.lsp.api.LspClient
import com.intellij.platform.lsp.api.LspIntegrationProvider
import com.intellij.platform.lsp.api.lsWidget.LspClientWidgetItem
import jp.s6n.idea.typespec.icons.TypeSpecIcons

class TypeSpecLspIntegrationProvider : LspIntegrationProvider {
    override fun fileOpened(
        project: Project,
        file: VirtualFile,
        clientStarter: LspIntegrationProvider.LspClientStarter
    ) {
        Logger.getInstance(this.javaClass).warn("fileOpened")
        if (!TypeSpecLspClientDescriptor.isSupportedFile(file)) return

        val interpreter = NodeJsInterpreterManager.getInstance(project).getInterpreter(true) ?: return

        val descriptor = findTspServer(project, interpreter, file.parent ?: return) ?: return Notifications.Bus.notify(
            Notification(
                "TypeSpec",
                "TypeSpec is not installed",
                "Could not find @typespec/compiler in the current directory.",
                NotificationType.WARNING
            )
        )

        clientStarter.ensureClientStarted(descriptor)
    }

    override fun createWidgetItem(lspClient: LspClient, currentFile: VirtualFile?) =
        LspClientWidgetItem(lspClient, currentFile, TypeSpecIcons.Tsp)

    private fun findTspServer(project: Project, interpreter: NodeJsInterpreter, directory: VirtualFile): TypeSpecLspClientDescriptor? {
        val tspDirectory = directory.findDirectory("node_modules/@typespec/compiler")
            ?: return findTspServer(project, interpreter, directory.parent ?: return null)

        val tspServerFile = tspDirectory.findFile("cmd/tsp-server.js") ?: return null

        return TypeSpecLspClientDescriptor(project, directory, interpreter, tspServerFile)
    }
}
