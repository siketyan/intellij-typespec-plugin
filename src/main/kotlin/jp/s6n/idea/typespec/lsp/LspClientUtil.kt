package jp.s6n.idea.typespec.lsp

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspClient
import com.intellij.platform.lsp.api.LspClientManager
import kotlin.io.path.relativeToOrNull

/**
 * Hacky LSP client integration utilities to use officially unsupported requests of LSP.
 */
object LspClientUtil {
    fun getClientManager(project: Project): LspClientManager =
        LspClientManager.getInstance(project)
}

fun LspClientManager.findClientForFile(file: VirtualFile): LspClient? =
    getClients(TypeSpecLspIntegrationProvider::class.java)
        .find { client ->
            client.descriptor.roots.any {
                file.toNioPath().relativeToOrNull(it.toNioPath()) != null
            }
        }
