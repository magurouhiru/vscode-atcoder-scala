package abc.`389`

import scala.io.StdIn.readLine
import scala.annotation.tailrec

object B {
  def main(args: Array[String]): Unit = {
    val x = readLine().split(" ").map(_.toLong).head
    println(minFactorialGE(x))
  }

  def minFactorialGE(x: Long): Long = {
    Iterator
      .iterate((1L, 1L)) { case (fact, n) => (fact * (n + 1), n + 1) }
      .dropWhile { case (fact, _) => fact < x }
      .next()
      ._2
  }

  // def minFactorialGE(x: Long): Long = {
  //   @tailrec
  //   def loop(n: Long, acc: Long): Long = {
  //     if (acc >= x) n
  //     else loop(n + 1, acc * (n + 1))
  //   }
  //   loop(1, 1)
  // }
}
