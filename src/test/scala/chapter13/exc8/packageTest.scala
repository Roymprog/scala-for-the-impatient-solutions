package chapter13.exc8

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class packageTest extends FlatSpec with Matchers {
  "single dimensional array" should "convert to 2d" in {
    val arr = Array(1,2,3,4,5,6)
    arrayTo2D(arr, 3) shouldBe Array(Array(1,2,3), Array(4,5,6))
  }
}
