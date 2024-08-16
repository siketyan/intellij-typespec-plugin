package jp.s6n.idea.typespec.lang.psi.impl

import com.intellij.navigation.ItemPresentation
import jp.s6n.idea.typespec.lang.psi.TypeSpecAliasStatement
import jp.s6n.idea.typespec.lang.psi.TypeSpecElement
import jp.s6n.idea.typespec.lang.psi.TypeSpecEnumStatement
import jp.s6n.idea.typespec.lang.psi.TypeSpecInterfaceStatement
import jp.s6n.idea.typespec.lang.psi.TypeSpecModelStatement
import jp.s6n.idea.typespec.lang.psi.TypeSpecOperationStatement
import jp.s6n.idea.typespec.lang.psi.TypeSpecUnionStatement

object TypeSpecImplUtil {
    @JvmStatic
    fun getPresentation(element: TypeSpecElement): ItemPresentation? {
        return when (element) {
            is TypeSpecEnumStatement -> object : ItemPresentation {
                override fun getPresentableText() = element.identifier.text
                override fun getIcon(unused: Boolean) = element.getIcon(0)
            }
            is TypeSpecUnionStatement -> object : ItemPresentation {
                override fun getPresentableText() = element.identifier.text
                override fun getIcon(unused: Boolean) = element.getIcon(0)
            }
            is TypeSpecModelStatement -> object : ItemPresentation {
                override fun getPresentableText() = element.identifier.text
                override fun getIcon(unused: Boolean) = element.getIcon(0)
            }
            is TypeSpecInterfaceStatement -> object : ItemPresentation {
                override fun getPresentableText() = element.identifier.text
                override fun getIcon(unused: Boolean) = element.getIcon(0)
            }
            is TypeSpecOperationStatement -> object : ItemPresentation {
                override fun getPresentableText() = element.operation.identifier.text
                override fun getIcon(unused: Boolean) = element.getIcon(0)
            }
            is TypeSpecAliasStatement -> object : ItemPresentation {
                override fun getPresentableText() = element.identifier.text
                override fun getIcon(unused: Boolean) = element.getIcon(0)
            }
            else -> null
        }
    }
}
