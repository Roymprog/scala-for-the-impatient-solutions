package chapter18

/*
* Ex1
* */
class ImmutablePair[T, S](val first:T, val second:S) {
  def swap = new ImmutablePair[S, T](second, first)
}

/*
* Ex3
* */
object ImmutablePair {
  def swap[T,S](pair: ImmutablePair[T,S]) = new ImmutablePair(pair.second, pair.first)
}