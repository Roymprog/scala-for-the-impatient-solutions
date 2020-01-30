package chapter10.exc2

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class OrderedPointTest extends FlatSpec with Matchers {
  "Point 1 " should "be smaller than Point2" in{
    val point1 = new OrderedPoint
    val point2 = new OrderedPoint(1,0)
    point1.compare(point2) shouldBe -1
  }

  "Point 2 " should "be greater than Point1" in{
    val point1 = new OrderedPoint
    val point2 = new OrderedPoint(1,0)
    point2.compare(point1) shouldBe 1
  }

  "Point 1" should "be equal to point 2" in{
    val point1 = new OrderedPoint
    val point2 = new OrderedPoint
    point1.compare(point2) shouldBe 0
  }
}
