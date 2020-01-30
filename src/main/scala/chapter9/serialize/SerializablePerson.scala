package chapter9.serialize

class SerializablePerson(val name :String) extends Serializable{
  override def toString = s"I'm called ${name}"
}

object SerializablePersonRunner extends App {
  val fred = new SerializablePerson("Fred")
  import java.io._
  val path = "/tmp/test.obj"
  val out = new ObjectOutputStream(new FileOutputStream(path))
  out.writeObject(fred)
  out.close()
  val in = new ObjectInputStream(new FileInputStream(path))
  val savedFred = in.readObject().asInstanceOf[SerializablePerson]
  println(savedFred)
}