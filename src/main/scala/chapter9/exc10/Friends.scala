package chapter9.exc10

import scala.collection.mutable.ArrayBuffer

object Friends extends App {
  val roy = new Person("Roy")
  val kevin = new Person("Kevin")
  val emiel = new Person("Emiel")
  roy.addFriend(kevin)
  roy.addFriend(emiel)

  import java.io._
  val path = "/tmp/test.obj"
  val out = new ObjectOutputStream(new FileOutputStream(path))
  out.writeObject(roy)
  out.close()
  val in = new ObjectInputStream(new FileInputStream(path))
  val savedRoy = in.readObject().asInstanceOf[Person]
  println(savedRoy)
}

class Person(val name: String) extends Serializable{
  val friends = ArrayBuffer[Person]()

  def addFriend(p:Person):Person.this.type = {
    if (!friends.contains(p)) {
      friends.addOne(p)
      p.addFriend(this)
    }
    this
  }

  final override def equals(other: Any) :Boolean = {
    other.isInstanceOf[Person] && {
      val that = other.asInstanceOf[Person]
      name == that.name
    }
  }

  override def toString: String = s"Name: ${name}\n${friends.map(_.name).mkString("Friends:\n","\n","\n")}"
}