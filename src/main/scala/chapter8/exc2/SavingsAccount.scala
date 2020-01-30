package chapter8.exc2

import chapter8.exc1.BankAccount

class SavingsAccount(initialAmount:Double) extends BankAccount(initialAmount) {
  private var monthlyActions = 0
  private val allowedActions = 3
  private val interest = 1.01

  override def deposit(amount: Double): Double = {
    conditionalExec(amount, super.deposit)
  }

  override def withdraw(amount: Double): Double = {
    conditionalExec(amount, super.withdraw)
  }

  private def allowedAction : Boolean = monthlyActions <= allowedActions

  private def balance :Double = super.withdraw(0)

  def earnMonthlyInterest() : Double =  {
    monthlyActions = 0
    super.deposit(balance*interest)
  }

  private def conditionalExec(amount:Double, method: Double => Double) : Double = {
    monthlyActions += 1
    if (allowedAction) method(amount)
    else method(amount - 1)
  }
}
