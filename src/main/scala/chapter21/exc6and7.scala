package chapter21
import java.awt._

object exc6and7 {
  /*
  * Point ordering will be in lexicographic order i.e. first x is compared than y is compared.
  */
  implicit class OrderedPoint(private val point: Point) extends Ordered[Point] {
    override def compare(that: Point): Int = {
      if (point.x > that.x) 1
      else if (point.x < that.x) -1
      else point.y.compare(that.y)
    }
  }

  /*
  * Using Pythagorean algorithm to compare points being closest to the origin.
  * 1: this point is closer
  * 0: points are equally close
  * -1: that point is closer
   */
  implicit class OrderedPointOrigin(private val point: Point) extends Ordered[Point] {
    override def compare(that: Point): Int = {
      if (distanceToOrigin(point) < distanceToOrigin(that)) 1
      else if (distanceToOrigin(point) > distanceToOrigin(that)) -1
      else 0
    }

    private def distanceToOrigin(p:Point) :Double = math.sqrt(math.pow(p.x,2) + math.pow(p.y,2))
  }
}
