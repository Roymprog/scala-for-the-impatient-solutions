package chapter10.exc2
import java.awt.Point

class OrderedPoint(x :Int = 0, y:Int = 0) extends java.awt.Point(x,y) with scala.math.Ordered[java.awt.Point] {
  override def compare(that: Point): Int = {
    if (this.x.compare(that.x) != 0) this.x.compare(that.x) else this.y.compare(that.y)
  }
}


