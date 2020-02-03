package chapter11.exc9

import java.nio.file.Path

import scala.collection.mutable.ArrayBuffer

object PathComponentsSeq {
  def unapplySeq(arg: java.nio.file.Path):Option[Seq[Path]] = {
    Some(for (i <- 0 until arg.getNameCount) yield arg.getName(i))
  }
}

object PathComponentSeqRunner extends App {
  import java.nio.file.FileSystems

  val p = FileSystems.getDefault.getPath("/home/fd99od/Documents/scala-for-the-impatient/.gitignore")
  val PathComponentsSeq(a,b,c,d,e) = p
  println(s"$a , $b, $c, $d, $e")
}
