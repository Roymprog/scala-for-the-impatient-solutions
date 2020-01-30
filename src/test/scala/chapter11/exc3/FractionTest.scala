package chapter11.exc3

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class FractionTest extends FlatSpec with Matchers {
  "Fraction multiplication " should "return 1/9" in {
    val f1 = Fraction(1,3)
    val f2 = Fraction(1,3)

    f1*f2 shouldBe Fraction(1,9)
  }

  "Fraction multiplication " should "return 1/3" in {
    val f1 = Fraction(1,2)
    val f2 = Fraction(2,3)

    f1*f2 shouldBe Fraction(1,3)
  }

  "Fraction addition " should "return 4/9" in {
    val f1 = Fraction(1,9)
    val f2 = Fraction(2,6)

    f1+f2 shouldBe Fraction(4,9)
  }

  "Fraction subtraction " should "return 4/9" in {
    val f1 = Fraction(1,9)
    val f2 = Fraction(2,6)

    f1-f2 shouldBe Fraction(-2,9)
  }

  "Fraction division " should "return 3/4" in {
    val f1 = Fraction(1,2)
    val f2 = Fraction(1,3)

    f1/f2 shouldBe Fraction(3,2)
  }

}
