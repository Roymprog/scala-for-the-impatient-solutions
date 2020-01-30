package chapter6.exc2

object MilesToKilometers extends UnitConversion {
  override def convert(num: Double): Double = num*1.609344
}
