package chapter14.exc6and7and8

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class packageTest extends FlatSpec with Matchers {
  "binaryTree" should "have its sum calculated" in {
    val tree = Node(Node(Leaf(3), Leaf(8)), Node(Leaf(5), Leaf(2)))
    val amount = sum(tree)

    amount shouldBe 18
  }

  "tree" should "have its sum calculated " in {
    val tree = Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
    val amount = sum(tree)

    amount shouldBe 18
  }

  "tree" should "have its sum calculated using operators " in {
    val tree = Node(_+_, Node(_*_, Leaf(3), Leaf(8)), Leaf(2), Node(_-_,Leaf(5)))
    val amount = eval(tree)

    amount shouldBe 21
  }

  "tree" should "have its sum calculated using operators and more than 2 leaves" in {
    val tree = Node(_+_, Node(_*_, Leaf(3), Leaf(8), Leaf(2)), Leaf(2), Node(_-_,Leaf(5)))
    val amount = eval(tree)

    amount shouldBe 45
  }
}
