package chapter13

import scala.reflect.ClassTag

package object exc8 {
  def arrayTo2D[A:ClassTag](arr:Array[A], columns:Int): Array[Array[A]] = arr.grouped(columns).toArray
}
