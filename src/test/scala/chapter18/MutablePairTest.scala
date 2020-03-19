package chapter18

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class MutablePairTest extends FlatSpec with Matchers {
  "Swap" should "pair of same types" in {
    val pair = new MutablePair("Hi", "Bye")
    pair.swap
    pair.first shouldBe "Bye"
    pair.second shouldBe "Hi"
  }
}
