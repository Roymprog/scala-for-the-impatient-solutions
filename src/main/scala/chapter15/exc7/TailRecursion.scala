package chapter15.exc7

import scala.annotation.tailrec

class TailRecursion {
  // without this method being final or private, it cannot be annotated with tailrec
  @tailrec final def sum(l :List[Int], amount:Int = 0) :Int = l match {
    case Nil => amount
    case _ => sum(l.tail, l.head)
  }
}
