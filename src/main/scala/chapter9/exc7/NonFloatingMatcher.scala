package chapter9.exc7

object NonFloatingMatcher extends App {
  val example = "2.23 euros for coffee is not a lot\n" +
    "5.30 is a lot for a coffee"
  val regex = "(\\d+\\.\\d+) (.+)".r("num", "rest")
  for(mat <- regex.findAllMatchIn(example))
    println(mat.group("rest"))
}
