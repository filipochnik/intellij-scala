package org.jetbrains.plugins.scala

import com.intellij.openapi.editor.ex.EditorEx
import com.intellij.openapi.editor.{Document, Editor}
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.tree.IElementType
import org.jetbrains.plugins.scala.lang.lexer.ScalaTokenTypes
import org.jetbrains.plugins.scala.lang.scaladoc.lexer.ScalaDocElementType

/**
  * Nikolay.Tropin
  * 27-Oct-17
  */
package object editor {
  implicit class DocumentExt(val document: Document) extends AnyVal {
    def commit(project: Project): Unit = PsiDocumentManager.getInstance(project).commitDocument(document)
  }

  implicit class EditorExt(val editor: Editor) extends AnyVal {
    def offset: Int = editor.getCaretModel.getOffset

    def commitDocument(project: Project): Unit = editor.getDocument.commit(project)

    def inScalaString(offset: Int): Boolean = inTokenType(offset, ScalaTokenTypes.STRING_LITERAL_TOKEN_SET.contains)

    def inDocComment(offset: Int): Boolean = inTokenType(offset, _.isInstanceOf[ScalaDocElementType])

    private def inTokenType(offset: Int, predicate: IElementType => Boolean): Boolean = {
      if (offset == 0 || offset >= editor.getDocument.getTextLength) return false

      val highlighter = editor.asInstanceOf[EditorEx].getHighlighter
      val iterator = highlighter.createIterator(offset - 1)
      predicate(iterator.getTokenType)
    }
  }
}