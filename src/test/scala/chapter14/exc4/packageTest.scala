package chapter14.exc4

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class packageTest extends FlatSpec with Matchers {
    val bundle =
    Bundle("Father's day special", 20.0,
      Article("Scala for the Impatient", 39.95),
      Bundle("Anchor Distillery Sampler", 10.0,
        Article("Old Potrereo Straight Rye Whiskey", 79.95),
        Article("Junipero Gin", 32.95)
      )
    )

  "price" should "be determined for article and bundle" in {
    val amount = price(bundle)
    (amount > 122.84) && ( amount < 122.86) shouldBe true
  }

  "price" should "be determined for multiple" in {
    val multiple = Multiple(10, bundle)
    val amount = price(multiple)
    (amount > 1228.4) && ( amount < 1228.6) shouldBe true
  }
}
