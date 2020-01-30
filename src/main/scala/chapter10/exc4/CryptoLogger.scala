package chapter10.exc4

trait CryptoConsoleLogger extends ConsoleLogger {
  override val prepended: String = "This message is from the CryptoConsoleLogger: "
  val cipher = -3

  override def log(msg:String) :Unit = {
    super.log(encrypt(msg))
  }

  def encrypt(s :String) :String = s.map(_ + cipher).map(_.toChar).mkString
}

trait Logger {
  def log(msg:String) :Unit
}

trait ConsoleLogger extends Logger {
  val prepended = "This message is from the ConsoleLogger: "
  def log(msg:String) :Unit = println(s"${prepended}${msg}")
}

object CryptoConsoleLoggerRunner extends App {
  val message = "This is a Ceaser cipher test!"

  val logger = new CryptoConsoleLogger{}

  logger.log(message)

  val uselessLogger = new CryptoConsoleLogger{
    override val cipher = 0
  }

  uselessLogger.log(message)
}