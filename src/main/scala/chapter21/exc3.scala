package chapter21

import scala.annotation.tailrec

object exc3 {
  implicit class Factorial(private val n:Int) {
    def ! :Int = if (n == 1) n else n*(n-1).!
  }

  implicit def int2factorial(n :Int) = new Factorial(n)
}
