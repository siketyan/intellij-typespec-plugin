package jp.s6n.idea.typespec.folding

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.FoldingBuilderEx
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import jp.s6n.idea.typespec.lang.psi.*

class TypeSpecFoldingBuilder : FoldingBuilderEx() {
    override fun buildFoldRegions(root: PsiElement, document: Document, quick: Boolean): Array<FoldingDescriptor> {
        return root.children.flatMap { findRegions(it) }.toTypedArray()
    }

    override fun getPlaceholderText(node: ASTNode) = "..."

    override fun isCollapsedByDefault(node: ASTNode) = false

    private fun findRegions(element: PsiElement): List<FoldingDescriptor> {
        return when (element) {
            is TypeSpecNamespaceStatement -> element.statementList.flatMap { findRegions(it) }
            is TypeSpecEnumStatement -> listOf(foldBlock(element.enumVariantsBlock))
            is TypeSpecUnionStatement -> listOf(foldBlock(element.unionVariantsBlock))
            is TypeSpecModelStatement -> if (element.modelPropertiesBlock != null) {
                listOf(foldBlock(element.modelPropertiesBlock!!))
            } else {
                emptyList()
            }
            is TypeSpecInterfaceStatement -> listOf(foldBlock(element.interfaceOperationsBlock))
            else -> emptyList()
        }
    }

    private fun foldBlock(block: PsiElement): FoldingDescriptor {
        return FoldingDescriptor(
            block.node,
            TextRange(block.textRange.startOffset + 1, block.textRange.endOffset - 1),
        )
    }
}
