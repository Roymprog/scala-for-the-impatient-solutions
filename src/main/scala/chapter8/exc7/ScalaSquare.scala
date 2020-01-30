package chapter8.exc7

import chapter8.exc5.Point
import chapter8.exc6.Rectangle

class ScalaSquare(corner:Point = new Point(0,0), val size : Double = 0) extends Rectangle(new Point(corner.x, corner.y + size), corner, size) {
  def this(width: Double) {
    this(size=width)
  }
}

class JavaSquare(corner:Point = new Point(0,0), val size : Double = 0) extends java.awt.Rectangle(corner.x.toInt, corner.y.toInt, size.toInt, size.toInt) {
  def this(width: Double) {
    this(size=width)
  }
}

object ShapesRunner extends App {
  val square1 = new ScalaSquare
  val square2 = new ScalaSquare(5)
  val square3 = new ScalaSquare(new Point(10,10), 8)
  val square4 = new JavaSquare
  val square5 = new JavaSquare(5)
  val square6 = new JavaSquare(new Point(10,10), 8)

  val center1 = square1.centerPoint
  val center2 = square2.centerPoint
  val center3 = square3.centerPoint

  println(s"Square1 has center (${center1.x}, ${center1.y}) and width ${square1.size}")
  println(s"Square2 has center (${center2.x}, ${center2.y}) and width ${square2.size}")
  println(s"Square3 has center (${center3.x}, ${center3.y}) and width ${square3.size}")
  println(s"Square4 has center (${square4.getCenterX()}, ${square4.getCenterY()}) and width ${square4.getWidth}")
  println(s"Square5 has center (${square5.getCenterX()}, ${square5.getCenterY()}) and width ${square5.getWidth}")
  println(s"Square6 has center (${square6.getCenterX()}, ${square6.getCenterY()}) and width ${square6.getWidth}")
}
