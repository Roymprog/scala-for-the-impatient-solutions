package chapter8.exc8

// Run: scalac src/main/scala/chapter8/exc8/SecretAgent.scala
// Then: javap -cp . -private chapter8.exc8.SecretAgent
class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret" // Don’t want to reveal name . . .
  override val toString = "secret" // . . . or class name
}
