package chapter8.exc9

class Creature {
  def range:Int = 2
  val env:Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override def range = 10
}

class Bug extends Creature {
  override val range = 10
}

// Using a def to override a def, works. Using a val to override a def
// returns in undesired behaviour
// The val overriding does not function as expected, because it
// leverages a private field called range and a getter method called
// range. The object is initialized with all int values, including
// range set to 0. The range method gets called before range is instantiated
// to the correct value. Overriding the method itself will work as expected,
// as the methods have to be available before the primary constructor is called,
// otherwise the constructor itself would not be available yet.
object Run extends App {
  val creature = new Creature
  val ant = new Ant
  val bug = new Bug
  println(s"Length of env for creature is ${creature.env.length}")
  println(s"Length of env for ant is ${ant.env.length}")
  println(s"Length of env for bug is ${bug.env.length}")
}

