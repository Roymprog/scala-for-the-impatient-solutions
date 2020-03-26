package chapter21

import chapter11.exc3.Fraction
import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers
import chapter21.exc4.compare

class exc4Test extends FlatSpec with Matchers {

  "Fraction compare" should "return correct" in {
    compare(Fraction(1,3), Fraction(1,2)) shouldBe -1
    compare(Fraction(1,2), Fraction(1,3)) shouldBe 1
  }

}
