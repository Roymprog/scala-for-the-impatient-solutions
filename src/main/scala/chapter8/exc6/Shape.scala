package chapter8.exc6

import chapter8.exc5.Point

abstract class Shape {
  def centerPoint :Point
}

class Cirlcle(x:Double, y: Double, radius:Double) extends Shape {
  override def centerPoint: Point = new Point(x,y)
}

class Rectangle(topLeft:Point, bottomLeft: Point, width:Double) extends Shape {
  override def centerPoint: Point = {
    val middleY = topLeft.y - (topLeft.y - bottomLeft.y)/2
    new Point(bottomLeft.x + width/2, middleY)
  }
}

