package jp.s6n.idea.typespec.lang

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.plugins.textmate.TextMateBackedFileType
import javax.swing.Icon

object TypeSpecFileType : LanguageFileType(TypeSpecLanguage), TextMateBackedFileType {
    override fun getName() = "TypeSpec"
    override fun getDescription() = "TypeSpec file"
    override fun getDefaultExtension() = "tsp"
    override fun getIcon(): Icon = AllIcons.FileTypes.Json
}
