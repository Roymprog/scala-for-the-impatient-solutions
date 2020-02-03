package chapter12.exc7

object AdjustRunner extends App{
  def adjustToPair(f: (Int, Int) => Int) : ((Int,Int)) => Int = x => f(x._1, x._2)

  println(adjustToPair(_*_)((6,7)))
  println(adjustToPair(_+_)((6,7)))
  println(adjustToPair(_-_)((6,7)))

  val pairs = (1 to 10) zip (11 to 20)
  println(pairs.map(adjustToPair(_+_)).reduceLeft(_+_))
}
