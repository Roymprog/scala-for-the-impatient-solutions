package chapter9.exc3

object LongWordPrinter extends App {
  for (s <- io.Source.fromFile("src/main/scala/chapter9/exc3/words.txt").mkString.split("\\s+") if s.length > 12) println(s)
}
