package abc.`387`

import scala.io.StdIn.readLine

object B {
  def main(args: Array[String]): Unit = {
    val x = readLine().toInt
    val ans = (1 to 9).flatMap((a) => (1 to 9).map(a * _)).filter(_ != x).sum
    println(ans)
  }
}
