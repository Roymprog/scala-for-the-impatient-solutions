package chapter14

package object exc6and7and8 {
  def sum(tree:Tree):Int = tree match {
    case Leaf(v) => v
    case Node(_, leafs @ _*) => leafs.map(sum _).sum
  }

  def eval(tree:Tree) :Int = tree match {
    case Leaf(v) => v
    case Node(op, node) => op(0, eval(node))
    case Node(op, rest @ _*) => rest.map(eval).reduce(op)
  }
}

package exc6and7and8 {
  sealed abstract class Tree

  case class Leaf(value:Int) extends Tree

  case class Node(op: (Int, Int) => Int, leafs: Tree*) extends Tree

  object Node {
    def apply(leafs: Tree*): Node = new Node(_+_, leafs: _*)
  }
}

