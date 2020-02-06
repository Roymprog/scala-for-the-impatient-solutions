package chapter14.exc9

import org.scalatest.{FlatSpec, Matchers}

class packageTest extends FlatSpec with Matchers {
  "list sum" should "return sum of options" in {
    sumNonNoneInList(List(Some(1), None, Some(2), Some(3), Some(4), None)) shouldBe 10
  }

  "list sum" should "return sum of all nones" in {
    sumNonNoneInList(List(None, None)) shouldBe 0
  }
}
