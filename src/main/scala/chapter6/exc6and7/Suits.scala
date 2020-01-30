package chapter6.exc6and7

object Suits extends Enumeration {
  val Clubs = Value("♣")
  val Spades = Value("♠")
  val Hearts = Value("♥")
  val Diamonds = Value("♦")

  def isRed(suit:Suits.Value) : Boolean = suit == Hearts || suit == Diamonds
}

object SuitsApplication extends App {
  for (suit <- Suits.values) println(Suits.isRed(suit))
}