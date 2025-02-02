package jp.s6n.idea.typespec.lsp

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServer
import com.intellij.platform.lsp.api.LspServerManager
import kotlin.io.path.relativeToOrNull

/**
 * Hacky LSP server integration utilities to use officially unsupported requests of LSP.
 */
object LspServerUtil {
    fun getServerManager(project: Project): LspServerManager =
        LspServerManager.getInstance(project)
}

fun LspServerManager.findServerForFile(file: VirtualFile): LspServer? =
    getServersForProvider(TypeSpecLspServerSupportProvider::class.java)
        .find { server ->
            server.descriptor.roots.any {
                file.toNioPath().relativeToOrNull(it.toNioPath()) != null
            }
        }
