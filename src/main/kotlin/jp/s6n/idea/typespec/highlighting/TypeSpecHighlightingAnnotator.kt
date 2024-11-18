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
            is TypeSpecScalarStatement -> element.identifier?.let { newAnnotation(it, holder, TypeSpecColors.TYPE) }
            is TypeSpecEnumStatement -> element.identifier?.let { newAnnotation(it, holder, TypeSpecColors.TYPE) }
            is TypeSpecUnionStatement -> element.identifier?.let { newAnnotation(it, holder, TypeSpecColors.TYPE) }
            is TypeSpecModelStatement -> element.identifier?.let { newAnnotation(it, holder, TypeSpecColors.TYPE) }
            is TypeSpecInterfaceStatement -> element.identifier?.let { newAnnotation(it, holder, TypeSpecColors.TYPE) }
            is TypeSpecAliasStatement -> element.identifier?.let { newAnnotation(it, holder, TypeSpecColors.TYPE) }

            is TypeSpecOperationStatement -> element.operation?.identifier?.let {
                newAnnotation(it, holder, TypeSpecColors.OPERATION)
            }

            is TypeSpecExternDecoratorStatement -> element.identifier?.let {
                newAnnotation(it, holder, TypeSpecColors.DECORATOR)
            }

            is TypeSpecAugmentDecoratorStatement -> element.path?.let {
                newAnnotation(it, holder, TypeSpecColors.DECORATOR)
            }

            is TypeSpecDecorator -> newAnnotation(element.path, holder, TypeSpecColors.DECORATOR)
            is TypeSpecDirective -> newAnnotation(element.identifier, holder, TypeSpecColors.DECORATOR)

            is TypeSpecTypeReference -> {
                (element.path.identifier ?: element.path.memberExpression?.lastChild)?.let {
                    newAnnotation(it, holder, TypeSpecColors.TYPE_REFERENCE)
                }
            }

            is TypeSpecTypeParameterList -> element.typeParameterList.forEach {
                newAnnotation(it.identifier, holder, TypeSpecColors.TYPE)
            }
        }
    }

    private fun newAnnotation(
        element: PsiElement, holder: AnnotationHolder, textAttributesKey: TextAttributesKey
    ) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION).textAttributes(textAttributesKey).range(element)
            .create()
    }
}
