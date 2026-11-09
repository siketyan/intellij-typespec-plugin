package jp.s6n.idea.typespec.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase

class TypeSpecFileTypeTest : BasePlatformTestCase() {
    fun testTspFileIsRecognizedAsTypeSpec() {
        val file = myFixture.configureByText("main.tsp", "model Foo {}")

        assertSame(TypeSpecFileType, file.virtualFile.fileType)
        assertTrue(TypeSpecFileType.isMyFile(file))
    }

    fun testOtherFileIsNotRecognizedAsTypeSpec() {
        val file = myFixture.configureByText("main.ts", "const foo = 1;")

        assertNotSame(TypeSpecFileType, file.virtualFile.fileType)
        assertFalse(TypeSpecFileType.isMyFile(file))
    }
}
