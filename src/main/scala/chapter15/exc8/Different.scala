package chapter15.exc8

class Different[@specialized(Int, Long) T] {
  def allDifferent (x:T, y:T, z:T) :Boolean = x != y && x!= z && y !=z
}
