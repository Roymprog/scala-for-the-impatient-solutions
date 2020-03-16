package chapter17

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

// NOTE: Make sure to type a URL, then add a space, then press enter. Otherwise the URL will
// be opened in a browser
object PrintUrlsOnPage extends App {
  import scala.concurrent.ExecutionContext.Implicits.global

  val f = ExecuteSequentially.visitUrlsOnPage()
  Await.ready(f, Duration.fromNanos(10000000000L))
  f.value.get.foreach(l => println(l))
}
