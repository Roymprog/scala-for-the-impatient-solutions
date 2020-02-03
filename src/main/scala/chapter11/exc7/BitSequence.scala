package chapter11.exc7

class BitSequence(l:Long) {
  private final val bits:Int = 64
  private var sb = new StringBuilder(("0"*bits) + l.toBinaryString takeRight bits)

  def long :StringBuilder = sb

  def apply(i :Int) :Char = {
    if (i < bits) {
      sb(i)
    } else throw new IndexOutOfBoundsException(s"Number only has $bits bits")
  }

  def update(i :Int, bit :Int) :StringBuilder = {
    if (i < bits) {
      if (bit == 0 || bit == 1) {
        sb.replace(i, i+1, bit.toString)
      } else throw new NumberFormatException(s"Bit can only be 0 or 1")
    } else throw new IndexOutOfBoundsException(s"Number only has $bits bits")
  }
}

object BitSequenceRunner extends App {
  val bitSequence = new BitSequence(986543219876219875L)
  println(bitSequence.long)
  println(bitSequence.update(0, 1))
  println(bitSequence(23))
}
