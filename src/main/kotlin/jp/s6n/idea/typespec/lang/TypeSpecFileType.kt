package jp.s6n.idea.typespec.lang

import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiFile
import jp.s6n.idea.typespec.icons.TypeSpecIcons
import javax.swing.Icon

object TypeSpecFileType : FileType {
    override fun getName() = "TypeSpec"
    override fun getDescription() = "TypeSpec file"
    override fun getDefaultExtension() = "tsp"
    override fun getIcon(): Icon = TypeSpecIcons.Tsp
    override fun isBinary() = false

    fun isMyFile(file: PsiFile) = isMyFile(file.virtualFile)

    fun isMyFile(file: VirtualFile) =
        file.fileType === TypeSpecFileType && file.extension == defaultExtension
}
