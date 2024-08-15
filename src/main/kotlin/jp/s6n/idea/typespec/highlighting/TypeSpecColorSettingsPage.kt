package jp.s6n.idea.typespec.highlighting

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.OptionsBundle
import com.intellij.openapi.options.colors.AttributesDescriptor

private val DESCRIPTORS = arrayOf(
    AttributesDescriptor(
        OptionsBundle.messagePointer("options.language.defaults.block.comment"),
        TypeSpecColors.DECORATOR
    ),
)

private val ADDITIONAL_DESCRIPTORS = mapOf<String, TextAttributesKey>()
