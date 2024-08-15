package jp.s6n.idea.typespec.lang.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil

fun TypeSpecPathExpression.findTopmostPathParent(): PsiElement? {
    return PsiTreeUtil.skipParentsOfType(this, TypeSpecPathExpression::class.java)
}
