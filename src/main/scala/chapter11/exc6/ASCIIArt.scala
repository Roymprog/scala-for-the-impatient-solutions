package chapter11.exc6

import scala.collection.mutable.ArrayBuffer

class ASCIIArt(var art :ArrayBuffer[String] = ArrayBuffer()) {

  def cat :ASCIIArt = {
    val buf :ArrayBuffer[String] = ArrayBuffer()

    buf.addOne("  /\\_/\\  ")
    buf.addOne(" ( ' ' ) ")
    buf.addOne(" (  -  ) ")
    buf.addOne("  | | |  ")
    buf.addOne(" (__|__) ")

    ASCIIArt(buf)
  }

  def text :ASCIIArt = {
    val buf :ArrayBuffer[String] = ArrayBuffer()
    val lid = "    -----   "
    buf.addOne(lid)
    buf.addOne("  / Hello \\ ")
    buf.addOne(" <  Scala |")
    buf.addOne("  \\ Coder / ")
    buf.addOne(lid)

    ASCIIArt(buf)
  }

  override def toString: String = art.mkString("\n")

  def |(other:ASCIIArt) :ASCIIArt = {
    for (i <- 0 until other.art.length)
      art(i) = art(i) ++ other.art(i)
    this
  }

  def __(other: ASCIIArt) :ASCIIArt = {
    ASCIIArt(art ++ other.art)
  }
}

object ASCIIArt {
  def apply(art :ArrayBuffer[String] = ArrayBuffer()): ASCIIArt = new ASCIIArt(art)
}

object ASCIIArtRunner extends App {
  val asciiArt = ASCIIArt()
  println(asciiArt.cat)

  println(asciiArt.cat __ asciiArt.cat)
  println(asciiArt.cat | asciiArt.text)
  println(asciiArt.cat | asciiArt.text __ asciiArt.cat | asciiArt.text)
}