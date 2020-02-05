package chapter13.exc7

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

import chapter13.exc7.exc7.tupledMult

class packageTest extends FlatSpec with Matchers {
  "tupledMult" should "be applicable to zipped lists of doubles" in {
    val prices = Array(50.0, 34.2, 1.04)
    val quantity = Array(5.0, 2, 10)

    (prices zip quantity).map(tupledMult) shouldBe Array(250.0, 68.4, 10.4)
  }
}
