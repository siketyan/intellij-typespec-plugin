package jp.s6n.idea.typespec.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import jp.s6n.idea.typespec.icons.TypeSpecIcons

class CreateTypeSpecFileAction : CreateFileFromTemplateAction() {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder
            .setTitle("New TypeSpec File")
            .addKind("TypeSpec file", TypeSpecIcons.Tsp, "TypeSpec file")
    }

    override fun getActionName(directory: PsiDirectory?, newName: String, templateName: String?) =
        "Create TypeSpec File: $newName"
}
