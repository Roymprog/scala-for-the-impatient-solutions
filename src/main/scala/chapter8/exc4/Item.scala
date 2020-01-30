package chapter8.exc4

import scala.collection.mutable.ArrayBuffer

abstract class Item {
  def price :Double
  def description :String
}

class SimpleItem(val price: Double, val description :String) extends Item {
}

class Bundle extends Item {
  private val items = new ArrayBuffer[Item]

  override def price: Double = items.map(item => item.price).sum

  override def description: String = {
    val separator = "---"
    items.mkString(separator, s"\n${separator}\n", separator)
  }

  def addItem(item:Item) = items.addOne(item)
}