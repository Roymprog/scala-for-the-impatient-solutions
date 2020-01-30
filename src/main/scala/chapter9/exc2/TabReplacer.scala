package chapter9.exc2

import java.io.{File, FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream, PrintWriter}


object TabReplacer extends App {
  val n = 2
  val tabRegex = "\t".r
  val file = "src/main/scala/chapter9/exc2/tab.txt"
  val input = io.Source.fromFile(file).mkString
  val output = tabRegex.replaceAllIn(input, " " * n)
  val out = new PrintWriter(new File(file))
  out.write(output)
  out.close()
}