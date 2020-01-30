package chapter9.exc9

import java.nio.file.{Files, Paths}

object ClassCounter extends App {
  val dir = "./"
  val entries = Files.walk(Paths.get(dir))
  val classRegex = "\\.class$".r
  try {
    entries.forEach(entry => if (classRegex.findFirstIn(entry.toString) != None) println(entry.toString))
  } finally {
    entries.close()
  }
}
