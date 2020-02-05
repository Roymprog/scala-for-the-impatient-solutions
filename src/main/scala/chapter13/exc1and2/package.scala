package chapter13

import scala.collection.{immutable, mutable}

package object exc1and2 {
  def indices[A](s :Seq[A]) : mutable.Map[A, mutable.SortedSet[Int]] = {
    val indices = mutable.Map[A, mutable.SortedSet[Int]]()
    for (i <- 0 until s.length) indices(s(i)) = indices.getOrElse(s(i), mutable.SortedSet[Int]()).union(Set(i))
    indices
  }

  def indicesImm[A](s :Seq[A]) : immutable.Map[A, mutable.SortedSet[Int]] = {
    var indices = immutable.Map[A, mutable.SortedSet[Int]]()
    for (i <- 0 until s.length) indices = indices + ((s(i) ,indices.getOrElse(s(i), mutable.SortedSet[Int]()).union(Set(i))))
    indices
  }

}

