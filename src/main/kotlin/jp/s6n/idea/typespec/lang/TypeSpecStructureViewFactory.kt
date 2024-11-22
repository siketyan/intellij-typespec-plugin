package jp.s6n.idea.typespec.lang

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.ide.structureView.StructureViewModel
import com.intellij.ide.structureView.StructureViewModelBase
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder
import com.intellij.lang.PsiStructureViewFactory
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.fileEditor.OpenFileDescriptor
import com.intellij.psi.PsiFile
import jp.s6n.idea.typespec.lsp.LspServerUtil
import jp.s6n.idea.typespec.lsp.findServerForFile
import org.eclipse.lsp4j.DocumentSymbol
import org.eclipse.lsp4j.DocumentSymbolParams
import org.eclipse.lsp4j.SymbolKind

// TODO: Replace if the official LSP integration supported code folding (textDocument/documentSymbol).
class TypeSpecStructureViewFactory : PsiStructureViewFactory {
    override fun getStructureViewBuilder(file: PsiFile): TreeBasedStructureViewBuilder? {
        if (!TypeSpecFileType.isMyFile(file)) return null

        val lspServer = LspServerUtil.getServerManager(file.project).findServerForFile(file.virtualFile) ?: return null

        val params = DocumentSymbolParams(lspServer.getDocumentIdentifier(file.virtualFile))
        val response = lspServer.sendRequestSync { it.textDocumentService.documentSymbol(params) } ?: return null

        return object : TreeBasedStructureViewBuilder() {
            override fun createStructureViewModel(editor: Editor?) =
                TypeSpecStructureViewModel(
                    response.map { it.right },
                    file,
                    editor,
                )

            override fun isRootNodeShown() = false
        }
    }
}

class TypeSpecStructureViewModel(symbols: List<DocumentSymbol>, file: PsiFile, editor: Editor?) :
    StructureViewModelBase(file, editor, TypeSpecStructureViewRootElement(symbols, file)),
    StructureViewModel.ElementInfoProvider {
    override fun isAlwaysShowsPlus(element: StructureViewTreeElement?) =
        element is TypeSpecStructureViewRootElement ||
            (element is TypeSpecStructureViewElement && element.value.children.isEmpty())

    override fun isAlwaysLeaf(element: StructureViewTreeElement?) =
        element is TypeSpecStructureViewElement && element.value.children.isNullOrEmpty()
}

class TypeSpecStructureViewRootElement(
    private val symbols: List<DocumentSymbol>,
    private val file: PsiFile,
) : StructureViewTreeElement {
    override fun getPresentation() = PresentationData()

    override fun getChildren() = symbols.map { TypeSpecStructureViewElement(it, file) }.toTypedArray()

    override fun getValue() = symbols
}

class TypeSpecStructureViewElement(
    private val symbol: DocumentSymbol,
    private val file: PsiFile,
) : StructureViewTreeElement {
    private val descriptor = OpenFileDescriptor(
        file.project,
        file.virtualFile,
        symbol.range.start.line,
        symbol.range.start.character,
    )

    override fun getPresentation(): ItemPresentation {
        // https://github.com/microsoft/typespec/blob/2e1c85774a13459075a5c00c5499904852643904/packages/compiler/src/server/symbol-structure.ts
        val icon = when (symbol.kind) {
            SymbolKind.Namespace -> AllIcons.Nodes.Package
            SymbolKind.Property -> AllIcons.Nodes.Property
            SymbolKind.Enum -> AllIcons.Nodes.Enum
            SymbolKind.Interface -> AllIcons.Nodes.Interface
            SymbolKind.Function -> AllIcons.Nodes.Function
            SymbolKind.Variable -> AllIcons.Nodes.Type // tsp-server uses Variables for aliases
            SymbolKind.EnumMember -> AllIcons.Nodes.Field
            SymbolKind.Struct -> AllIcons.Nodes.ModelClass
            else -> null
        }

        return PresentationData(symbol.name, symbol.detail, icon, null)
    }

    override fun getChildren() =
        symbol.children
            ?.map { TypeSpecStructureViewElement(it, file) }
            ?.toTypedArray()
            ?: emptyArray()

    override fun getValue() = symbol

    override fun navigate(requestFocus: Boolean) {
        descriptor.navigate(requestFocus)
    }

    override fun canNavigate() = true

    override fun canNavigateToSource() = true
}
