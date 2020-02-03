package chapter12.exc123456

object FunctionsRunner extends App {
  def values(fun: (Int) => Int, low:Int, high:Int) :Seq[(Int,Int)] = {
    (low to high).map(x => (x, fun(x)))
  }

  def largest(seq : Seq[Int]) :Int = seq.reduceLeft((a,b) => math.max(a,b))

  def factorial(n:Int) :Int = {
    if (n<1) 1
    else (1 to n).reduceLeft(_*_)
  }

  def factorialFoldLeft(n:Int) :Int = (1 to n).foldLeft(1)(_*_)

  def largest(fun: (Int) => Int, inputs: Seq[Int]) :Int = largest(inputs.map(fun))

  def largestInput(fun: (Int) => Int, inputs: Seq[Int]) :Int = (inputs.map(fun) zip inputs).find(x => x._1 == largest(fun, inputs)).get._2

  values(x => x*x, -5,5).foreach(println)
  val l = largest(0 to 13)
  println(s"Largest in list is $l")
  println(s"0 factorial is: ${factorial(0)}")
  println(s"5 factorial is: ${factorial(5)}")
  println(s"0 factorial is: ${factorialFoldLeft(0)}")
  println(s"5 factorial is: ${factorialFoldLeft(5)}")

  val larg = largest(x => 10*x-x*x, 1 to 10)
  println(s"larg is $larg")
  val largestIn = largestInput(x => 10*x-x*x, 1 to 10)
  println(s"largestIn is $largestIn")
}
