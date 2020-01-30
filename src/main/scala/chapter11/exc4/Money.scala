package chapter11.exc4

class Money(d:Int, c:Int) {
  private final val centsPerDollar = 100
  val dollars = d + c/centsPerDollar
  val cents = c%centsPerDollar

  def +(other:Money) :Money = {
    val money = new Money(dollars + other.dollars, cents + other.cents)
    Money(money.dollars, money.cents)
  }

  def -(other:Money) :Money = {
    this + Money(-other.dollars, -other.cents)
  }

  def <(other:Money) :Boolean = (dollars < other.dollars) || (dollars == other.dollars && cents < other.cents)

  override def equals(o: Any): Boolean = {
    if (o.isInstanceOf[Money]) {
      val other = o.asInstanceOf[Money]
      other.dollars == dollars && other.cents == cents
    } else {
      false
    }
  }
}

object Money {
  def apply(d:Int, c:Int) :Money= new Money(d, c)
}