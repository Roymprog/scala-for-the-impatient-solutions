package chapter13.exc7

package object exc7 {
  def tupledMult: ((Double,Double)) => Double = {
    def f (i:Double, j:Double) = i*j
    (f _ ).tupled
  }
}
