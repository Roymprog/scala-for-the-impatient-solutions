package chapter7.exc9

import java.lang.System

// Compile using: scalac src/main/scala/chapter7/exc9/PasswordReader.scala from project root
// Run using: scala -cp . chapter7.exc9.PasswordReader
object PasswordReader extends App {
  val username = System.getProperties().getProperty("user.name")
  val console = System.console()
  System.out.println("Please type your password: ")
  val pw = console.readPassword().mkString
  if (pw.equals("secret")) {
    System.out.println(s"Hi ${username}!")
  } else {
    System.err.println("Wrong password!")
  }
}
