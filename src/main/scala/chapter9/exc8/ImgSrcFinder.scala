package chapter9.exc8

object ImgSrcFinder extends App {
  val url = "https://docs.scala-lang.org/tour/regular-expression-patterns.html"
  val html = io.Source.fromURL(url).mkString
  val imgSrcRegex = """(<img.*src="([^"]+)".*>)""".r
  for (m <- imgSrcRegex.findAllMatchIn(html)) println(m.group(2))
}
