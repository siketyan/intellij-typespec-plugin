package jp.s6n.idea.typespec.lang.psi

import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet.*
import jp.s6n.idea.typespec.lang.TypeSpecLanguage
import jp.s6n.idea.typespec.lang.psi.TypeSpecElementTypes.*

class TypeSpecTokenType(debugName: String) : IElementType(debugName, TypeSpecLanguage)

val TYPESPEC_STRINGS = create(STRING_LITERAL)
val TYPESPEC_COMMENTS = create(DOC_COMMENT, BLOCK_COMMENT, LINE_COMMENT)
val TYPESPEC_KEYWORDS = create(IMPORT, USING, NAMESPACE, ENUM, UNION, MODEL, INTERFACE, EXTENDS, IS, OP, ALIAS)
val TYPESPEC_BRACES = create(LBRACE, RBRACE)
val TYPESPEC_BRACKETS = create(LBRACKET, RBRACKET)
val TYPESPEC_PARENTHESES = create(LPAREN, RPAREN)
