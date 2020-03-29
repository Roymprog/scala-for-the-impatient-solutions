package chapter21

import chapter11.exc3.Fraction
import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers
import chapter21.exc5._

class exc5Test extends FlatSpec with Matchers {

  "Fraction compare" should "return correct" in {
    smaller(Fraction(1,3), Fraction(1,2)) shouldBe Fraction(1,3)
    smaller(Fraction(1,3), Fraction(1,9)) shouldBe Fraction(1,9)
  }

}
