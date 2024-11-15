package jp.s6n.idea.typespec.highlighting

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import jp.s6n.idea.typespec.lang.lexer.TypeSpecLexer
import jp.s6n.idea.typespec.lang.psi.*

class TypeSpecSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = TypeSpecLexer()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
        pack(ATTRIBUTES[tokenType])
}

private val ATTRIBUTES = buildMap<IElementType, TextAttributesKey> {
    put(TypeSpecElementTypes.DOC_COMMENT, TypeSpecColors.DOC_COMMENT)
    put(TypeSpecElementTypes.BLOCK_COMMENT, TypeSpecColors.BLOCK_COMMENT)
    put(TypeSpecElementTypes.LINE_COMMENT, TypeSpecColors.LINE_COMMENT)
    put(TypeSpecElementTypes.STRING_LITERAL, TypeSpecColors.STRING_LITERAL)
    put(TypeSpecElementTypes.NUMERIC_LITERAL, TypeSpecColors.NUMBER)
    put(TypeSpecElementTypes.IDENT, TypeSpecColors.IDENTIFIER)
    put(TypeSpecElementTypes.COMMA, TypeSpecColors.COMMA)
    put(TypeSpecElementTypes.DOT, TypeSpecColors.DOT)
    put(TypeSpecElementTypes.EQ, TypeSpecColors.OPERATION_SIGN)
    put(TypeSpecElementTypes.COLON, TypeSpecColors.OPERATION_SIGN)
    put(TypeSpecElementTypes.QUEST, TypeSpecColors.OPERATION_SIGN)
    put(TypeSpecElementTypes.AT, TypeSpecColors.DECORATOR)
    put(TypeSpecElementTypes.ATAT, TypeSpecColors.DECORATOR)

    SyntaxHighlighterBase.fillMap(this, TYPESPEC_KEYWORDS, TypeSpecColors.KEYWORD)
    SyntaxHighlighterBase.fillMap(this, TYPESPEC_BRACKETS, TypeSpecColors.BRACKETS)
    SyntaxHighlighterBase.fillMap(this, TYPESPEC_BRACES, TypeSpecColors.BRACES)
    SyntaxHighlighterBase.fillMap(this, TYPESPEC_PARENTHESES, TypeSpecColors.PARENTHESES)
}
