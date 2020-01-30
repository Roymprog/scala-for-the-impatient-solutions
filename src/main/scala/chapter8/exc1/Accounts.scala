package chapter8.exc1

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double):Double = { super.deposit(charge(amount)) }
  override def withdraw(amount: Double):Double = { super.withdraw(charge(amount))}
  private def charge(amount:Double) :Double = amount - 1
}