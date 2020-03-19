package chapter18

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class ImmutablePairTest extends FlatSpec with Matchers {
  "Swap" should "pair of same types" in {
    val pair = new ImmutablePair("Hi", 1)
    val pair2 = pair.swap
    pair2.first shouldBe 1
    pair2.second shouldBe "Hi"
  }

  "Object swap" should "pair of same types" in {
    val pair = new ImmutablePair("Hi", 1)
    val pair2 = ImmutablePair.swap(pair)
    pair2.first shouldBe 1
    pair2.second shouldBe "Hi"
  }
}
