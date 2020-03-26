package chapter21

import chapter11.exc3.Fraction

object exc4 {

  def compare(x:Fraction, y:Fraction ): Int = (x - y).n.sign

  object Smaller {
    def smaller[T](a:T, b:T)(implicit order :T => Ordered[T]) :T
      = if (order(a) < b) a else b
  }
}
