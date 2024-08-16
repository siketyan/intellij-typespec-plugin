package jp.s6n.idea.typespec.lang

import com.intellij.icons.AllIcons
import com.intellij.ide.IconProvider
import com.intellij.psi.PsiElement
import jp.s6n.idea.typespec.lang.psi.*
import javax.swing.Icon

class TypeSpecIconProvider : IconProvider() {
    override fun getIcon(element: PsiElement, flags: Int): Icon? {
        return when (element) {
            is TypeSpecEnumStatement -> AllIcons.Nodes.Enum
            is TypeSpecUnionStatement -> AllIcons.Nodes.Enum
            is TypeSpecModelStatement -> AllIcons.Nodes.Class
            is TypeSpecInterfaceStatement -> AllIcons.Nodes.Interface
            is TypeSpecAliasStatement -> AllIcons.Nodes.Type
            is TypeSpecOperationStatement -> AllIcons.Nodes.Function
            else -> null
        }
    }
}
