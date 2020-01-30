package chapter10.exc8

import chapter10.exc4.Logger

trait FootballPlayer extends Person with Player with Logger {
  override val firstName: String = "John"
  override val lastName: String = "Doe"

  override val sports: String = "football"

  override def toString: String = s"Hi! My name is ${firstName} ${lastName}.\n${super.toString}"
}
