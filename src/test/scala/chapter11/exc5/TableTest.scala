package chapter11.exc5

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class TableTest extends FlatSpec with Matchers {
  "Table" should "form proper html" in {
    Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET" .toString shouldBe
      "<table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling</td><td>Odersky</td></tr><tr><td>JVM</td><td>JVM, .NET</td></tr></table>"
  }
}
