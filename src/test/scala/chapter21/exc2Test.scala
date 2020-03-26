package chapter21

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers
import chapter21.exc2.int2PercentageLike

class exc2Test extends FlatSpec with Matchers {
  "Implicit conversions" should "allow percentage add" in {
    120 +% 10 shouldBe 132
  }
}
