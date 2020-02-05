package chapter13

import scala.collection.mutable.ListBuffer

package object exc4 {
  def collectElements[A,B](keys: Seq[A], map:Map[A,B]) : Seq[B] = {
    keys.flatMap(map.get(_))
  }
}
