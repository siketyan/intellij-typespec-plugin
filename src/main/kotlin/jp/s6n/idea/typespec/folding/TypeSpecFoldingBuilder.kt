package jp.s6n.idea.typespec.folding

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.FoldingBuilderEx
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiElement
import jp.s6n.idea.typespec.lsp.LspServerUtil
import jp.s6n.idea.typespec.lsp.findServerForFile
import org.eclipse.lsp4j.FoldingRangeRequestParams

// TODO: Replace if the official LSP integration supported code folding (textDocument/foldingRange).
class TypeSpecFoldingBuilder : FoldingBuilderEx() {
    override fun buildFoldRegions(root: PsiElement, document: Document, quick: Boolean): Array<FoldingDescriptor> {
        val file = root.containingFile.virtualFile
        val lspServer = LspServerUtil.getServerManager(root.project).findServerForFile(file) ?: return emptyArray()

        val response = lspServer
            .sendRequestSync { server ->
                server.textDocumentService.foldingRange(
                    FoldingRangeRequestParams(lspServer.getDocumentIdentifier(file))
                )
            }
            ?: return emptyArray()

        return response
            .map {
                FoldingDescriptor(
                    root.firstChild,
                    document.getLineStartOffset(it.startLine) + it.startCharacter,
                    document.getLineEndOffset(it.endLine - 1) + it.endCharacter + 1,
                    null, // TODO
                    it.collapsedText ?: "...",
                )
            }
            .toTypedArray()
    }

    override fun getPlaceholderText(node: ASTNode) = "..."

    override fun isCollapsedByDefault(node: ASTNode) = false
}
