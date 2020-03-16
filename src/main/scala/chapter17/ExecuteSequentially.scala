package chapter17

import scala.annotation.tailrec
import scala.concurrent.Future
import scala.util.matching.Regex

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
    @tailrec def actUntil() :T = {
      val res = action()
      if (until(res)) res
      else actUntil()
    }

    Future[T] {
      actUntil()
    }
  }

  /*
 * Ex7
 * */
  def countPrimes(n: BigInt) : Future[Int] = {
    val cores = Runtime.getRuntime.availableProcessors


    val isPrime = (bigInts :Seq[BigInt]) => Future {
      bigInts.count(b => b.isProbablePrime(1))
    }

    val groups = (BigInt(1) until n).grouped(cores)

    val futureCount = Future.traverse(groups)(isPrime)
    for (count <- futureCount)
      yield count.sum
  }

  /*
  * Ex8
  * */
  def visitUrlsOnPage() : Future[Seq[String]] = {
    import scalaj.http.Http

    val pageUrl = Future {
      scala.io.StdIn.readLine("Enter URL to visit: ")
    }

    val visit = (url:String) => Future {
      Http(url).asString.body
    }

    val hyperLinkRegex = new Regex(""""(https?:\/\/)\w+\.(\w+\.)*(org|nl|com)(\/\w+)*""")

    val hyperLinks = (body:String) => Future {
      hyperLinkRegex.findAllIn(body).toSeq
    }

    for(page <- pageUrl; visited <- visit(page); links <- hyperLinks(visited))
      yield links
  }
}
