package chapter21

import chapter11.exc3.Fraction

object exc5 {

  implicit class OrderedFraction(private val f:Fraction) extends Ordered[Fraction] {
    override def compare(that: Fraction): Int = (f - that).n.sign
  }

  def smaller[T](a:T, b:T)(implicit order :T => Ordered[T]) :T
    = if (order(a) < b) a else b
}
