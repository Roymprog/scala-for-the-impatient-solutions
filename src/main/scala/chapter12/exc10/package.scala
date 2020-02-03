package chapter12

package object exc10 {
  def unless (condition: => Boolean)(block: => Unit) {
    if(!condition) block
  }
}

object UnlessRunner extends App {
  import exc10.unless

  val x = 3
  val threshold = 5
  unless(x > threshold) {
    println(s"$x is smaller than $threshold")
  }
}