package jp.s6n.idea.typespec.highlighting

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.psi.PsiElement
import jp.s6n.idea.typespec.lang.psi.*

class TypeSpecHighlightingAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is TypeSpecPathType -> newAnnotation(element.path.lastChild, holder, TypeSpecColors.TYPE_REFERENCE)
            is TypeSpecDecorator -> newAnnotation(element.pathExpression, holder, TypeSpecColors.DECORATOR)
            is TypeSpecEnumStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecUnionStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecModelStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecInterfaceStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecOperationStatement -> newAnnotation(element.operation.identifier, holder, TypeSpecColors.OPERATION)
            is TypeSpecAliasStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
        }
    }

    private fun newAnnotation(
        element: PsiElement, holder: AnnotationHolder, textAttributesKey: TextAttributesKey
    ) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .textAttributes(textAttributesKey)
            .range(element)
            .create()
    }
}
