package chapter11.exc4

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class MoneyTest extends FlatSpec with Matchers {
  "Money " should "add up properly" in {
    Money(1,75) + Money(0,50) shouldBe Money(2,25)
  }

  "Money " should "be comparable" in {
    Money(1,74) + Money(0,50) < Money(2,25) shouldBe true
  }
}
