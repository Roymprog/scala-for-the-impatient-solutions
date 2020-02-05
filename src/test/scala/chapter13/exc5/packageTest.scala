package chapter13.exc5

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class packageTest extends FlatSpec with Matchers {
  "custom mkString" should "result in string" in {
    val arr = Array("Hi,", "ik", "ben", "Roy")
    mkString(arr, " ") shouldBe "Hi, ik ben Roy"
  }
}
