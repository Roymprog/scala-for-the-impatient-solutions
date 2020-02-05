package chapter13

package object exc5 {
  def mkString(s:Seq[String], del:String) = {
    s.reduceLeft(_+del+_)
  }
}
