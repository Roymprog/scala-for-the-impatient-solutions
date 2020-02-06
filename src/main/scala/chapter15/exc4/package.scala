package chapter15

import scala.annotation.varargs

package object exc4 {
  @varargs def sum(ints: Int*) :Int = {
    ints.sum
  }
}
