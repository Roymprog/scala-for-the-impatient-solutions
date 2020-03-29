package chapter21

import java.awt._

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers
import chapter21.exc5.smaller

class exc6And7Test extends FlatSpec with Matchers {

  "Points" should "be ordered lexicographically" in {
    import chapter21.exc6and7.OrderedPoint

    val p1 = new Point(1, 2)
    val p2 = new Point(1, 1)
    p1.compare(p2) shouldBe 1

    val p3 = new Point(1, 1)
    val p4 = new Point(1, 1)
    p3.compare(p4) shouldBe 0

    val p5 = new Point(1, 1)
    val p6 = new Point(1, 2)
    p5.compare(p6) shouldBe -1

    smaller(p1, p2) shouldBe p2
  }

  "Points" should "be ordered on distance to origin" in {
    import chapter21.exc6and7.OrderedPointOrigin

    val p1 = new Point(1, 1)
    val p2 = new Point(1, 2)
    p1.compare(p2) shouldBe 1
    p2.compare(p1) shouldBe -1

    val p3 = new Point(1, 1)
    val p4 = new Point(-1, -1)
    p3.compare(p4) shouldBe 0

  }
}