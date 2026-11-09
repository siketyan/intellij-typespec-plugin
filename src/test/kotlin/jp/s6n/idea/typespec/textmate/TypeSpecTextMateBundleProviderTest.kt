package jp.s6n.idea.typespec.textmate

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import kotlin.io.path.exists

class TypeSpecTextMateBundleProviderTest : BasePlatformTestCase() {
    fun testProvidesTypeSpecBundle() {
        val bundle = TypeSpecTextMateBundleProvider().getBundles().single()

        assertEquals("typespec", bundle.name)
        assertTrue(bundle.path.resolve("package.json").exists())
    }
}
