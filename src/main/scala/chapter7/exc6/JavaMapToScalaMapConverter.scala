package chapter7.exc6

import java.util.{Map => JavaMap}
import scala.collection.mutable.{Map => ScalaMap}


class JavaMapToScalaMapConverter {
  def convert[A,B](map: JavaMap[A,B]) :ScalaMap[A,B] = {
    val m = new collection.mutable.HashMap[A,B]()
    map.forEach((k,v) => m.addOne(k,v))
    m
  }
}
