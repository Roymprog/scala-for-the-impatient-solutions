package chapter13.exc1and2

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

import scala.collection.mutable

class IndicesTest extends FlatSpec with Matchers {
  import chapter13.exc1and2.indices

  "Mississipi" should "have correct indexes" in {
    val m = indices("Mississippi")
    m('M') shouldBe mutable.Set(0)
    m('i') shouldBe mutable.Set(1,4,7,10)
    m('s') shouldBe mutable.Set(2,3,5,6)
    m('p') shouldBe mutable.Set(8,9)
  }

  "Mississipi" should "have correct indexes using immutable map" in {
    val m = indicesImm("Mississippi")
    m('M') shouldBe mutable.Set(0)
    m('i') shouldBe mutable.Set(1,4,7,10)
    m('s') shouldBe mutable.Set(2,3,5,6)
    m('p') shouldBe mutable.Set(8,9)
  }
}
