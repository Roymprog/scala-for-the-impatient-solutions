package chapter18

/*
* Ex6
* */
object IterUtil {
  def middle[T](iter: Iterable[T]) =
    iter.find(t => iter.toList.indexOf(t) == (iter.size -1 )/2).get
}
