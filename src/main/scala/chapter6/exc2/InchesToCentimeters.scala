package chapter6.exc2

object InchesToCentimeters extends UnitConversion {
  override def convert(num: Double): Double = num*2.54
}
