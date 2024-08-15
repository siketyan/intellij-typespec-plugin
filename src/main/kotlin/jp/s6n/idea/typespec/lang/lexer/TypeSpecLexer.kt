package jp.s6n.idea.typespec.lang.lexer

import com.intellij.lexer.FlexAdapter
import jp.s6n.idea.typespec.lang.parser._TypeSpecLexer

class TypeSpecLexer : FlexAdapter(_TypeSpecLexer())
