package chapter15.exc1

import org.junit.Assert._
import org.junit.Test

class TestClass {
  @Test def test() = {
    assertTrue(true)
  }

  @Test(timeout = 100) def testTimeOut() = {
    assertTrue(true)
  }

  @Test(expected = classOf[RuntimeException]) def testException() = {
    throw new RuntimeException()
    ()
  }

  @Test(timeout = 100, expected = classOf[RuntimeException]) def testTimeOutException() = {
    throw new RuntimeException()
    ()
  }
}
