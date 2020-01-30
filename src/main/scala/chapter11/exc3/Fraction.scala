package chapter11.exc3

class Fraction(val n:Int,val d:Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n,d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n,d)

  def sign(a: Int) = if (a > 0) 1 else if (a < 0)  -1 else 0
  def gcd(a:Int, b:Int) :Int = if (b == 0) math.abs(a) else gcd(b, a%b)

  override def toString: String = s"$num/$den"

  def * (other:Fraction) = {
    val frac = Fraction(n*other.n, d*other.d)
    Fraction(frac.num, frac.den)
  }

  def + (other:Fraction) = {
    val numerator = (num*other.den) + (other.num*den)
    val denominator = den*other.den
    val frac = Fraction(numerator, denominator)
    Fraction(frac.num, frac.den)
  }

  def - (other:Fraction) = {
    this + Fraction(-other.num, other.den)
  }

  def / (other:Fraction) = {
    this * Fraction(other.den, other.num)
  }

  override def equals(o: Any): Boolean = {
    if (o.isInstanceOf[Fraction]) {
      val fraction = o.asInstanceOf[Fraction]
      fraction.n == n && fraction.d == d
    } else {
      false
    }
  }
}

object Fraction {
  def apply(n:Int, d:Int) = new Fraction(n,d)
}
