package jp.s6n.idea.typespec.lang.psi

import com.intellij.psi.PsiElement

fun TypeSpecMemberExpression.findTopmostPathParent(): PsiElement? {
    return this.identifierList.firstOrNull()
}
