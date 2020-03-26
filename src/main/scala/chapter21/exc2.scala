package chapter21

object exc2 {
  implicit class PercentageLike(private val x :Int) {
    def +% (n:Int) :Int = {
      val percentage =  n.toDouble/100
      x + (percentage*x).toInt
    }
  }

  implicit def int2PercentageLike(x :Int): PercentageLike = new PercentageLike(x)
}
