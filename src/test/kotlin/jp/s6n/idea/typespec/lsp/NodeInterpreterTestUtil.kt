package jp.s6n.idea.typespec.lsp

import com.intellij.execution.configurations.PathEnvironmentVariableUtil
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreterManager
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreterRef
import com.intellij.javascript.nodejs.interpreter.local.NodeJsLocalInterpreter
import com.intellij.openapi.Disposable
import com.intellij.openapi.project.Project
import org.junit.Assume.assumeNotNull

/**
 * Configures the local Node.js interpreter found in PATH as the project interpreter.
 * Skips the test if Node.js is not installed.
 */
fun setUpLocalNodeInterpreter(project: Project, disposable: Disposable): NodeJsLocalInterpreter {
    val node = PathEnvironmentVariableUtil.findInPath("node")
    assumeNotNull(node)

    val interpreter = NodeJsLocalInterpreter(node!!.absolutePath)
    NodeJsInterpreterManager.getInstance(project).setInterpreterRef(NodeJsInterpreterRef.create(interpreter), disposable)

    return interpreter
}
