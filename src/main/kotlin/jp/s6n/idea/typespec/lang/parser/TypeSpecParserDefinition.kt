package jp.s6n.idea.typespec.lang.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IFileElementType
import jp.s6n.idea.typespec.lang.TypeSpecLanguage
import jp.s6n.idea.typespec.lang.lexer.TypeSpecLexer
import jp.s6n.idea.typespec.lang.psi.*

class TypeSpecParserDefinition : ParserDefinition {
    override fun createLexer(project: Project?) = TypeSpecLexer()

    override fun createParser(project: Project?) = TypeSpecParser()

    override fun getFileNodeType() = FILE

    override fun getCommentTokens() = TYPESPEC_COMMENTS

    override fun getStringLiteralElements() = TYPESPEC_STRINGS

    override fun createElement(node: ASTNode?): PsiElement = TypeSpecElementTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider) = TypeSpecFile(viewProvider)

}

val FILE = IFileElementType(TypeSpecLanguage)
