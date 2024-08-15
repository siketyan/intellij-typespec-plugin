package jp.s6n.idea.typespec.lang.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import jp.s6n.idea.typespec.lang.TypeSpecFileType
import jp.s6n.idea.typespec.lang.TypeSpecLanguage

class TypeSpecFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, TypeSpecLanguage) {
    override fun getFileType() = TypeSpecFileType
}
