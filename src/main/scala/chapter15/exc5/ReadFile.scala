package chapter15.exc5

import scala.io.Source

object ReadFileInto {
  def String(filePath:String): String = {
    Source.fromFile(filePath).mkString
  }
}
