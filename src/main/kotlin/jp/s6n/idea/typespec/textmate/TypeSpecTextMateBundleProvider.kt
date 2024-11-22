package jp.s6n.idea.typespec.textmate

import com.intellij.openapi.application.PluginPathManager
import org.jetbrains.plugins.textmate.api.TextMateBundleProvider

class TypeSpecTextMateBundleProvider : TextMateBundleProvider {
    override fun getBundles() =
        PluginPathManager.getPluginResource(javaClass, "textmate/bundles/typespec")
            ?.let { listOf(TextMateBundleProvider.PluginBundle("typespec", it.toPath())) }
            ?: emptyList()
}
