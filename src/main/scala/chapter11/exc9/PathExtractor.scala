package chapter11.exc9

import java.nio.file.Path

object PathComponents {
  def unapply(arg: java.nio.file.Path) = {
    Some((arg.getParent,arg.getFileName))
  }
}

object PathComponentRunner extends App {
  import java.nio.file.FileSystems

  val p = FileSystems.getDefault.getPath("/home/fd99od/Documents/scala-for-the-impatient/.gitignore")
  val PathComponents(a, b) = p
  println(s"$a , $b")
}
