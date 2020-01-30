package chapter6.exc4

class Point(x:Int=0, y:Int=0) {

}

object Point {
  def apply(x:Int, y:Int) :Point = new Point(x, y)
}