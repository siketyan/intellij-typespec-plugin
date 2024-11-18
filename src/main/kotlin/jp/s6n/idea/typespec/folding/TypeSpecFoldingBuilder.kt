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
            is TypeSpecEnumStatement -> foldBlock(element.enumVariantsBlock ?: return emptyList())
            is TypeSpecUnionStatement -> foldBlock(element.unionVariantsBlock ?: return emptyList())
            is TypeSpecModelStatement -> foldBlock(element.modelExpression ?: return emptyList())
            is TypeSpecInterfaceStatement -> foldBlock(element.interfaceOperationsBlock ?: return emptyList())
            else -> emptyList()
        }
    }

    private fun foldBlock(block: PsiElement): List<FoldingDescriptor> {
        val textRange = TextRange(block.textRange.startOffset + 1, block.textRange.endOffset - 1)
        if (textRange.length == 0) return emptyList()
        return listOf(FoldingDescriptor(block.node, textRange))
    }
}
