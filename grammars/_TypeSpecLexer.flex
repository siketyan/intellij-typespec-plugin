package jp.s6n.idea.typespec.lang.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static jp.s6n.idea.typespec.lang.psi.TypeSpecElementTypes.*;

%%

%{
  public _TypeSpecLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _TypeSpecLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

STRING_LITERAL=\"([^\\\"\r\n]|\\[^\r\n])*\"?
NUMERIC_LITERAL=-?[0-9]+(\.[0-9]+)?
IDENT=[a-zA-Z][a-zA-Z0-9\-_]*|`(\\`|[^`])+`
WHITE_SPACE=[ \t\n\x0B\f\r]+
DOC_COMMENT="/"\*\*([^*]|\*[^/])*\*"/"
BLOCK_COMMENT="/"\*([^*]|\*[^/])*\*"/"
LINE_COMMENT="//".*

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }

  "import"                { return IMPORT; }
  "using"                 { return USING; }
  "namespace"             { return NAMESPACE; }
  "scalar"                { return SCALAR; }
  "init"                  { return INIT; }
  "enum"                  { return ENUM; }
  "union"                 { return UNION; }
  "model"                 { return MODEL; }
  "interface"             { return INTERFACE; }
  "extends"               { return EXTENDS; }
  "is"                    { return IS; }
  "op"                    { return OP; }
  "alias"                 { return ALIAS; }
  "extern"                { return EXTERN; }
  "dec"                   { return DEC; }
  "valueof"               { return VALUEOF; }
  "typeof"                { return TYPEOF; }
  "true"                  { return TRUE; }
  "false"                 { return FALSE; }
  "void"                  { return VOID; }
  "never"                 { return NEVER; }
  "any"                   { return ANY; }
  "{"                     { return LBRACE; }
  "}"                     { return RBRACE; }
  "("                     { return LPAREN; }
  ")"                     { return RPAREN; }
  "["                     { return LBRACKET; }
  "]"                     { return RBRACKET; }
  "<"                     { return LT; }
  ">"                     { return GT; }
  "="                     { return EQ; }
  "..."                   { return DOTDOTDOT; }
  "."                     { return DOT; }
  ":"                     { return COLON; }
  "::"                    { return COLONCOLON; }
  ";"                     { return SEMICOLON; }
  "?"                     { return QUEST; }
  "@"                     { return AT; }
  "@@"                    { return ATAT; }
  ","                     { return COMMA; }
  "|"                     { return PIPE; }
  "&"                     { return AMP; }
  "#"                     { return HASH; }
  "#{"                    { return HASHLBRACE; }
  "#["                    { return HASHLBRACKET; }

  {STRING_LITERAL}        { return STRING_LITERAL; }
  {NUMERIC_LITERAL}       { return NUMERIC_LITERAL; }
  {IDENT}                 { return IDENT; }
  {WHITE_SPACE}           { return WHITE_SPACE; }
  {DOC_COMMENT}           { return DOC_COMMENT; }
  {BLOCK_COMMENT}         { return BLOCK_COMMENT; }
  {LINE_COMMENT}          { return LINE_COMMENT; }

}

[^] { return BAD_CHARACTER; }
