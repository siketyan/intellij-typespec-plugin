package jp.s6n.idea.typespec.lang.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import jp.s6n.idea.typespec.lang.psi.TypeSpecElement

open class TypeSpecElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), TypeSpecElement
