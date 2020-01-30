package chapter8.exc8

// Run: scalac src/main/scala/chapter8/exc8/Person.scala
// Then: javap -cp . -private chapter8.exc8.Person
class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}