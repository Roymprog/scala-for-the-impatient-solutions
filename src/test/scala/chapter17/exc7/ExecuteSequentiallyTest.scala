package chapter17.exc7

import chapter17.ExecuteSequentially
import org.scalatest.FlatSpec
import org.scalatest.matchers.should.Matchers

class ExecuteSequentiallyTest extends FlatSpec with Matchers {
  import scala.concurrent.ExecutionContext.Implicits.global

  "Count bigInts" should "return 4" in {
    for (count <- ExecuteSequentially.countPrimes(BigInt(5)))
      count shouldBe 4
  }

  "Count bigInts" should "return 10" in {
    for (count <- ExecuteSequentially.countPrimes(BigInt(23)))
      count shouldBe 10
  }

  "Count bigInts" should "return 1229" in {
    for (count <- ExecuteSequentially.countPrimes(BigInt(10000)))
      count shouldBe 1229
  }
}
