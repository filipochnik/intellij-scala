import scala.collection.mutable.LinkedList
import scala.Nil
import scala.{List => scalaList}
import scala.collection.mutable.ArrayBuffer

package org.jetbrains.plugins.scala.structure {

import com.intellij.navigation.NavigationItem
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.util.Iconable;
import com.intellij.ui.LayeredIcon;
import com.intellij.ui.RowIcon;
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.psi._

import javax.swing._;
import java.util.ArrayList;
import java.util.List;

import org.jetbrains.plugins.scala.lang.psi.ScalaFile
import org.jetbrains.plugins.scala.lang.psi.ScalaPsiElement
import org.jetbrains.plugins.scala.lang.lexer.ScalaElementType
import org.jetbrains.plugins.scala.lang.parser.ScalaElementTypes
import org.jetbrains.plugins.scala.lang.psi.impl.top.templateStatements.TemplateStatement
import org.jetbrains.plugins.scala.lang.psi.impl.top._, org.jetbrains.plugins.scala.lang.psi.impl.top.defs._

/**
 * User: Dmitry.Krasilschikov
 * Date: 29.12.2006
 * Time: 17:50:40
 */

class ScalaStructureViewElement (element : PsiElement) requires ScalaStructureViewElement extends StructureViewTreeElement {
  private var myElement : PsiElement = element

  def getValue() : PsiElement = myElement

  def navigate(requestFocus : Boolean) : Unit = (myElement.asInstanceOf[NavigationItem]).navigate(requestFocus);

  def canNavigate() : Boolean = (myElement.asInstanceOf[NavigationItem]).canNavigate()

  def canNavigateToSource() : Boolean = (myElement.asInstanceOf[NavigationItem]).canNavigateToSource()

  override def getChildren() : Array[TreeElement] = {
    var childrenElements: ArrayBuffer[ScalaPsiElement] = new ArrayBuffer[ScalaPsiElement]();

    myElement match {
      case file : ScalaFile => childrenElements ++= file.getPackaging; childrenElements ++= file.childrenOfType[ScTmplDef](ScalaElementTypes.TMPL_DEF_BIT_SET)
      case packaging : ScPackaging => childrenElements.insertAll(0, packaging.getTmplDefs)
      case topDef : ScTmplDef if (topDef.getTemplateStatements != null) => childrenElements.insertAll(0, topDef.getTemplateStatements)
      case _ => {}
    }

    for ( val i <- Array.range(0, childrenElements.length))
      yield (new ScalaStructureViewElement(childrenElements.apply(i))).asInstanceOf[TreeElement]
  }

  override def getPresentation() : ItemPresentation = {
        new ItemPresentation() {
             def getPresentableText() : String = {
               myElement match {
                 case file : ScalaFile => file.getVirtualFile.getName
                 case packaging : ScPackaging => packaging.getFullPackageName
                 case topDef : ScTmplDef => topDef.getShortName
                 case templateStmt : TemplateStatement => templateStmt.getShortName
               }
            }

             override def getTextAttributesKey() : TextAttributesKey = null

             override def getLocationString() : String  = null

             override def getIcon(open : Boolean) : Icon = myElement.getIcon(Iconable.ICON_FLAG_OPEN);
        }
    }

}

}