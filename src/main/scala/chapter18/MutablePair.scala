package chapter18

/*
* Ex2
* */
class MutablePair[T](var first:T, var second:T) {
  def swap :MutablePair[T] = {
    val tmp = first
    first = second
    second = tmp
    this
  }
}

/*
* Ex4
* The Student that will be added can polymorphically be seen as a Person,
* so can be added as a person
* */

/*
* Ex5
* RichInt is a helper class for Int's. You want the implementations of RichInt
* to work for Int's
* */
