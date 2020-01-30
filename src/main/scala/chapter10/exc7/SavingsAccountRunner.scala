package chapter10.exc7

object SavingsAccountRunner extends App {
  val savingsAccount = new SavingsAccount
  savingsAccount.log(s"My balance is ${savingsAccount.balance}")
}
