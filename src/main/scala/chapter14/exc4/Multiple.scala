package chapter14

package object exc4 {
  def price(it:Item): Double = it match {
    case Article(_, p) => p
    case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
    case Multiple(q, item) => q*price(item)
  }
}

package exc4 {
  sealed abstract class Item

  case class Article(description:String, price:Double) extends Item

  case class Bundle(description: String, discount:Double, items:Item*) extends Item

  case class Multiple(quantity:Int, item: Item) extends Item
}

