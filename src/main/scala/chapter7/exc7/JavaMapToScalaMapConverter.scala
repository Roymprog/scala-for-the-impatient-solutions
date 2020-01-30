package chapter7.exc7

class JavaMapToScalaMapConverter {
  import java.util.{Map => JavaMap}
  import scala.collection.mutable.{Map => ScalaMap}

  def convert[A,B](map: JavaMap[A,B]) :ScalaMap[A,B] = {
    val m = new collection.mutable.HashMap[A,B]()
    map.forEach((k,v) => m.addOne(k,v))
    m
  }
}
