package chapter14

import scala.reflect.ClassTag

package object exc2and3 {
  def swap(pair:(Int,Int)) : (Int,Int) = {
    pair match {
      case (x,y) => (y,x)
      case _ => pair
    }
  }

  def swap[A:ClassTag](array: Array[A]) : Array[A] = {
    array match {
      case Array(first, second, rest @ _*) => Array(second, first) ++ rest
      case _ => array
    }
  }
}
