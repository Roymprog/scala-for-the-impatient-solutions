package chapter14

package object exc9 {
  def sumNonNoneInList(list: List[Option[Int]]) :Int = list.flatten.sum
}
