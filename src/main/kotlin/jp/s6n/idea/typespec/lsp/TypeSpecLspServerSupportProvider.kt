package jp.s6n.idea.typespec.lsp

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.findDirectory
import com.intellij.openapi.vfs.findFile
import com.intellij.platform.lsp.api.LspServerSupportProvider
import jp.s6n.idea.typespec.lang.TypeSpecFileType
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream

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
        val tspDirectory = directory.findDirectory("node_modules/@typespec/compiler")
            ?: return findTspServer(project, directory.parent ?: return null)

        val tspServerFile = tspDirectory.findFile("cmd/tsp-server.js") ?: return null
        val version = tspDirectory.findFile("package.json")
            ?.let { PackageJson.parseFile(it).version }
            ?: return null

        return TypeSpecLspServerDescriptor(project, directory, version, tspServerFile)
    }

    @Serializable
    class PackageJson(val version: String?) {
        companion object {
            private val decoder = Json {
                ignoreUnknownKeys = true
            }

            @OptIn(ExperimentalSerializationApi::class)
            fun parseFile(file: VirtualFile): PackageJson =
                decoder.decodeFromStream(file.inputStream)
        }
    }
}
