package jp.s6n.idea.typespec.lang

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiFile
import jp.s6n.idea.typespec.icons.TypeSpecIcons
import org.jetbrains.plugins.textmate.TextMateBackedFileType
import org.jetbrains.plugins.textmate.TextMateFileType
import javax.swing.Icon

object TypeSpecFileType : FileType, TextMateBackedFileType {
    override fun getName() = "TypeSpec"
    override fun getDescription() = "TypeSpec file"
    override fun getDefaultExtension() = "tsp"
    override fun getIcon(): Icon = TypeSpecIcons.Tsp
    override fun isBinary() = false

    fun isMyFile(file: PsiFile) = isMyFile(file.virtualFile)

    fun isMyFile(file: VirtualFile) =
        file.fileType == TextMateFileType.INSTANCE && file.extension == defaultExtension
}
