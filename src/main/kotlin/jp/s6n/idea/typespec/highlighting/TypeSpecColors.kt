package jp.s6n.idea.typespec.highlighting

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

object TypeSpecColors {
    val DOC_COMMENT = createTextAttributesKey("TYPESPEC_BLOCK_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT)
    val BLOCK_COMMENT = createTextAttributesKey("TYPESPEC_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
    val LINE_COMMENT = createTextAttributesKey("TYPESPEC_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val STRING_LITERAL = createTextAttributesKey("TYPESPEC_STRING_LITERAL", DefaultLanguageHighlighterColors.STRING)
    val KEYWORD = createTextAttributesKey("TYPESPEC_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
    val IDENTIFIER = createTextAttributesKey("TYPESPEC_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
    val NUMBER = createTextAttributesKey("TYPESPEC_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
    val BRACKETS = createTextAttributesKey("TYPESPEC_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
    val PARENTHESES = createTextAttributesKey("TYPESPEC_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
    val BRACES = createTextAttributesKey("TYPESPEC_BRACES", DefaultLanguageHighlighterColors.BRACES)
    val DOT = createTextAttributesKey("TYPESPEC_DOT", DefaultLanguageHighlighterColors.DOT)
    val COMMA = createTextAttributesKey("TYPESPEC_COMMA", DefaultLanguageHighlighterColors.COMMA)
    val OPERATION_SIGN =
        createTextAttributesKey("TYPESPEC_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN)

    val DECORATOR = createTextAttributesKey("TYPESPEC_DECORATOR", DefaultLanguageHighlighterColors.METADATA)
    val TYPE = createTextAttributesKey("TYPESPEC_TYPE", DefaultLanguageHighlighterColors.CLASS_NAME)
}
