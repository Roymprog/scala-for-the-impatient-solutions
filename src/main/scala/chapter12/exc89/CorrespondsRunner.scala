package chapter12.exc89

object CorrespondsRunner extends App {
  def corresponds[A, B](a:Seq[A], b:Seq[B], f:(A, B) => Boolean) :Boolean =
    a.length == b.length && (a.length == 0 || (f(a.head, b.head) && corresponds(a.tail, b.tail, f)))

  val arr = Array("Hello", "World", "!", "I'm", "Roy")
  val arrLengths = Array(5, 5, 1, 3, 3)

  println(arr.corresponds(arrLengths)(_.length == _))
  println(corresponds(arr,arrLengths, (a:String,b:Int) => a.length == b))
}
