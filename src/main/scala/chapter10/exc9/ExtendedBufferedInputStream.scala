package chapter10.exc9

import java.io.{BufferedInputStream, FileInputStream, InputStream}

import chapter10.exc4.{ConsoleLogger, CryptoConsoleLogger}

class ExtendedBufferedInputStream(is: InputStream) extends BufferedInputStream(is) with ConsoleLogger {
  override def read(): Int = {
    val int = super.read()
    super.log(s"Read byte: ${int.toString}")
    int
  }
}

class ExtendedFileInputStream(filePath: String) extends FileInputStream(filePath) with CryptoConsoleLogger {
  override def read(): Int = {
    val int = super.read()
    super.log(s"Read byte: ${int.toString}")
    int
  }
}

object InputStreamRunner extends App {
  val filePath = "src/main/scala/chapter10/exc9/text.txt"
  var bis :BufferedInputStream = null
  var is :InputStream = null

  try {
    bis = new ExtendedBufferedInputStream(new FileInputStream(filePath))
    is = new ExtendedFileInputStream(filePath)
    while (bis.available() > 0) {
      bis.read()
    }

    is.read()
  } finally {
    bis.close()
    is.close()
  }

}