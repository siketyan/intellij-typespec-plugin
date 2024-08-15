package jp.s6n.idea.typespec.highlighting

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.psi.PsiElement
import jp.s6n.idea.typespec.lang.psi.TypeSpecDecorator
import jp.s6n.idea.typespec.lang.psi.TypeSpecPathType

class TypeSpecHighlightingAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is TypeSpecPathType -> newAnnotation(element, holder, TypeSpecColors.TYPE)
            is TypeSpecDecorator -> newAnnotation(element.pathExpression, holder, TypeSpecColors.DECORATOR)
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
