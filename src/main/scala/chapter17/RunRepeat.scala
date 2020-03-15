package chapter17

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object RunRepeat extends App {
  val isSecret = (s:String) => {
    Thread.sleep(1000)
    s == "secret"
}

  val getInput = () => {
    val input = scala.io.StdIn.readLine("Prompt: ")
    input
  }

  Await.ready(ExecuteSequentially.repeat(getInput, isSecret),Duration.Inf)
}
