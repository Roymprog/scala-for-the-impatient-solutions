package chapter18

import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class IterUtilTest extends FlatSpec with Matchers {
  "Middle of world" should "return r" in {
    IterUtil.middle("World") shouldBe 'r'
  }
}
