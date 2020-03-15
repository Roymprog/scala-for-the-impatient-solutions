package chapter17

import scala.annotation.tailrec
import scala.concurrent.Future

object ExecuteSequentially {
  import scala.concurrent.ExecutionContext.Implicits.global

  /*
  * Ex2
  * NOTE: The exercise must have a typo in it, as the composition cannot possibly match otherwise
  * */
  def doInOrder[T, U, V](f: T => Future[U], g: U => Future[V]) : T => Future[V] = {
    t:T => f(t).flatMap(r => g(r))
  }

  /*
  * Ex3
  * */
  def doInOrderSequence[T] (f: (T => Future[T])*) : T => Future[T] = {
    t:T => f.foldLeft(Future(t))((cum, fut) => fut(cum.value.get.get))
  }

  /*
  * Ex4
  * */
  def doTogether[T, U, V] (f: T => Future[U], g: T => Future[V]) : T => Future[(U, V)] = {
    t: T => for (n1 <- f(t); n2 <- g(t))
      yield (n1, n2)
  }

  /*
  * Ex5
  * */
  def doTogether[T] (f: (T => Future[T])*) : T => Future[Seq[T]] = {
    t: T => Future.traverse(f)(fut => fut(t))
  }

  /*
  * Ex6
  * NOTE: The action is made callable in order to re-use reading from input
  * */
  def repeat[T] (action: () => T, until: T => Boolean): Future[T] = {
    @tailrec def doActionUntil() :T = {
      val res = action()
      if (until(res)) res
      else doActionUntil()
    }

    Future[T] {
      doActionUntil()
    }
  }
}
