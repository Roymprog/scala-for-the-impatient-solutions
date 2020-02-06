package chapter14

package object exc5 {
  def leafSum(any: Any) :Double = {
    val amount:Double = 0.0

    any match {
      case tree: List[Any] => amount + tree.map(leafSum).sum
      case int:Int => int
      case double:Double => double
      case _ => 0
    }
  }
}
