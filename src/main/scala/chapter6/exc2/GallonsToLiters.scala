package chapter6.exc2

object GallonsToLiters extends UnitConversion {
  override def convert(num: Double): Double = num*3.78541178
}
