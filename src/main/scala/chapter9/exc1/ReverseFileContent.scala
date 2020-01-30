package chapter9.exc1

import io.Source

object ReverseFileContent extends App {
  for (s <- Source.fromFile("build.sbt").getLines().toList.reverse)
    println(s)
}
