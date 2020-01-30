package chapter10.exc8

trait Player {
  val jersey :Int
  val sports :String = "no sport"

  override def toString: String = s"Playing ${sports} with jersey ${jersey}"
}
