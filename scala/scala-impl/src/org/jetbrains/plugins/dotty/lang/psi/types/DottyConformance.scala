package org.jetbrains.plugins.dotty.lang.psi.types

import com.intellij.openapi.util.Computable
import com.intellij.psi.PsiClass
import org.jetbrains.plugins.scala.lang.psi.types._

/**
  * @author adkozlov
  */
trait DottyConformance extends api.Conformance {
  typeSystem: api.TypeSystem =>

  override protected def conformsComputable(left: ScType, right: ScType, visited: Set[PsiClass], checkWeak: Boolean) =
    new Computable[ConstraintsResult] {
      override def compute(): ConstraintsResult = ConstraintsResult.Failure
    }

  private def isSubType(left: ScType, right: ScType) = right match {
    case DottyNoType() => false
    case _ => if (left eq right) true else firstTry(left, right)
  }

  private def firstTry(left: ScType, right: ScType): Boolean = false
}
