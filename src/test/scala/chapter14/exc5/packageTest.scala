package chapter14.exc5

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class packageTest extends FlatSpec with Matchers {
  "sum" should "work for list of any types"  in {
    val tree = List(List(3,8), 2, List(5, List("Sasfdsad", None, 8.3)), 2.1 )
    val amount = leafSum(tree)
    (amount > 28.4) && (amount < 28.5) shouldBe true
  }
}
