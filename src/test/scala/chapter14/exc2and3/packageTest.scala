package chapter14.exc2and3

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class packageTest extends FlatSpec with Matchers {
  "swap" should "swap pair of integers" in {
    val pair = (1,2)
    swap(pair) shouldBe (pair._2, pair._1)
  }

  "swap" should "swap first elements in array" in {
    val arr = Array(1,2,3)
    swap(arr) shouldBe Array(2,1,3)
  }

  "swap" should "keep single entry array" in {
    val arr = Array(1)
    swap(arr) shouldBe Array(1)
  }

  "swap" should "swap if only 2 entries" in {
    val arr = Array(1,2)
    swap(arr) shouldBe Array(2,1)
  }
}
