package chapter21

object exc10and11 {

  trait NumberLike[T] {
    def plus(x:T, y: T) :T
    def divideBy(x:T, n:Int):T
  }

  object NumberLike {
    implicit object NumberLikeDouble extends NumberLike[Double] {
      override def plus(x: Double, y: Double): Double = x+y

      override def divideBy(x: Double, n: Int): Double = x/n
    }

    implicit object NumberLikeBigDecimal extends NumberLike[BigDecimal] {
      override def plus(x: BigDecimal, y: BigDecimal): BigDecimal = x+y

      override def divideBy(x: BigDecimal, n: Int): BigDecimal = x/n
    }

    implicit object NumberLikeString extends NumberLike[String] {
      override def plus(x: String, y: String): String = x + y

      override def divideBy(x: String, n: Int): String = {
        val is = for (
          i <- 0 until x.length
          if i % n == 0
        ) yield x.charAt(i)
        is.mkString
      }
    }
  }

  def average[T](seq :Seq[T])(implicit ev: NumberLike[T]) :T = {
    if (seq.isEmpty) throw new IllegalArgumentException("Cannot take average of empty list")
    val head = seq.head
    val sum = seq.tail.foldLeft(head)((agg, n) => ev.plus(agg,n))
    ev.divideBy(sum,seq.length)
  }
}
