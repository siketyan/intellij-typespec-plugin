package jp.s6n.idea.typespec.lang.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import com.intellij.psi.util.childrenOfType
import jp.s6n.idea.typespec.lang.TypeSpecFileType
import jp.s6n.idea.typespec.lang.TypeSpecLanguage

class TypeSpecFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, TypeSpecLanguage) {
    val statements get() = childrenOfType<TypeSpecStatement>()

    override fun getFileType() = TypeSpecFileType
}
