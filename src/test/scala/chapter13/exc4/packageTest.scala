package chapter13.exc4

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers
import chapter13.exc4.collectElements

class packageTest extends FlatSpec with Matchers {
  "collectElements" should "get the correct elements"  in {
    val map = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
    val coll = Array("Tom", "Fred", "Harry")
    val arr = collectElements(coll, map)

    arr shouldBe Seq(3,5)
  }
}
