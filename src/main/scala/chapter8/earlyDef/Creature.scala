package chapter8.earlyDef

class Creature {
  val range:Int = 2
  val env:Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override val range = 10
}

class Bug extends {
  override val range = 10
} with Creature

object Run extends App {
  val creature = new Creature
  val ant = new Ant
  val bug = new Bug
  println(s"Length of env for creature is ${creature.env.length}")
  println(s"Length of env for ant is ${ant.env.length}")
  println(s"Length of env for bug is ${bug.env.length}")
}
