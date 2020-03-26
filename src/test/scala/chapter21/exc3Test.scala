package chapter21

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers
import chapter21.exc3.int2factorial

class exc3Test extends FlatSpec with Matchers {
  "Implicit conversions" should "return factorial" in {
    5.! shouldBe 120
  }
}
