package jp.s6n.idea.typespec.lang

import com.intellij.ide.projectView.PresentationData
import com.intellij.ide.structureView.StructureViewBuilder
import com.intellij.ide.structureView.StructureViewModelBase
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.lang.PsiStructureViewFactory
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.Editor
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiFile
import jp.s6n.idea.typespec.lang.psi.TypeSpecFile

class TypeSpecStructureViewFactory : PsiStructureViewFactory {
    override fun getStructureViewBuilder(file: PsiFile) = object : TreeBasedStructureViewBuilder() {
        override fun createStructureViewModel(editor: Editor?) =  TypeSpecStructureViewModel(file, editor)
    }
}

class TypeSpecStructureViewModel(file: PsiFile, editor: Editor?) : StructureViewModelBase(file, editor, TypeSpecStructureViewElement(file))

class TypeSpecStructureViewElement(private val element: NavigatablePsiElement) : StructureViewTreeElement {
    override fun getValue() = element

    override fun getPresentation(): ItemPresentation = element.presentation ?: PresentationData()

    override fun getChildren(): Array<TreeElement> {
        return when (element) {
            is TypeSpecFile -> {
                element.statements
                    .filterIsInstance<NavigatablePsiElement>()
                    .filter { it.presentation != null }
                    .map { TypeSpecStructureViewElement(it) }
                    .toTypedArray()
            }
            else -> TreeElement.EMPTY_ARRAY
        }
    }
}
