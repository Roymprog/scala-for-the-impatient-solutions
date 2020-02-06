package chapter15.exc6

object Volatility extends App {
  val vol = new Volatile(false)

  val thread1 = new Thread {
    override def run(): Unit = {
      Thread.sleep(3000)
      vol.bool = true
    }
  }

  val thread2 = new Thread {
    override def run(): Unit = {
      while(!vol.bool) {
      Thread.sleep(50)
      }
      println("Boolean is finally true!")
    }
  }

  thread1.start()
  thread2.start()
}

object NonVolatility extends App {
  val nonVol = new NonVolatile(false)

  val thread1 = new Thread {
    override def run(): Unit = {
      Thread.sleep(3000)
      nonVol.bool = true
    }
  }

  val thread2 = new Thread {
    override def run(): Unit = {
      while(!nonVol.bool) {
        Thread.sleep(50)
      }
      println("Boolean is finally true!")
    }
  }

  thread1.start()
  thread2.start()
}

class Volatile(@volatile var bool:Boolean)

class NonVolatile(var bool:Boolean)