package chapter21

import chapter21.exc10and11.average
import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class exc10And11Test extends FlatSpec with Matchers {

  "Average" should "be calculable" in {
    average(Seq(1.0,2.0,3.0)) shouldBe 2.0
    average(Seq(BigDecimal(1.0),BigDecimal(2.0),BigDecimal(3.0))) shouldBe BigDecimal(2.0)
    average(Seq("Hello", "World")) shouldBe "Hlool"
  }

}
