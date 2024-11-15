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
            is TypeSpecTypeReference -> newAnnotation(element.path.identifier ?: element.path.memberExpression?.lastChild!!, holder, TypeSpecColors.TYPE_REFERENCE)
            is TypeSpecDecorator -> newAnnotation(element.path, holder, TypeSpecColors.DECORATOR)
            is TypeSpecDirective -> newAnnotation(element.identifier, holder, TypeSpecColors.DECORATOR)
            is TypeSpecScalarStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecEnumStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecUnionStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecModelStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecInterfaceStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecOperationStatement -> newAnnotation(element.operation.identifier, holder, TypeSpecColors.OPERATION)
            is TypeSpecAliasStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.TYPE)
            is TypeSpecExternDecoratorStatement -> newAnnotation(element.identifier, holder, TypeSpecColors.DECORATOR)
            is TypeSpecAugmentDecoratorStatement -> newAnnotation(element.path, holder, TypeSpecColors.DECORATOR)
            is TypeSpecTypeParameterList -> element.typeParameterList.forEach { newAnnotation(it.identifier, holder, TypeSpecColors.TYPE) }
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
