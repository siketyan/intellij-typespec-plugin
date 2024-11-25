package jp.s6n.idea.typespec.actions

import com.intellij.icons.AllIcons
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class CreateTypeSpecFileAction : CreateFileFromTemplateAction() {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder
            .setTitle("New TypeSpec File")
            .addKind("TypeSpec file", AllIcons.FileTypes.Json, "TypeSpec file")
    }

    override fun getActionName(directory: PsiDirectory?, newName: String, templateName: String?) =
        "Create TypeSpec File: $newName"
}
