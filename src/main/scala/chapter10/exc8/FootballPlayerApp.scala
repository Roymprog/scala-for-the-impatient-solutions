package chapter10.exc8

import chapter10.exc4.{ConsoleLogger, CryptoConsoleLogger}

object FootballPlayerApp extends App {
  val roy = new {
    override val firstName = "Roy"
    override val lastName = "van Santen"
    val jersey = 7
  } with FootballPlayer with ConsoleLogger

  val johnDoe = new {
    val jersey = 10
  } with FootballPlayer with CryptoConsoleLogger

  roy.log(roy.toString)
  roy.log(johnDoe.toString)

  johnDoe.log(roy.toString)
  johnDoe.log(johnDoe.toString)
}
