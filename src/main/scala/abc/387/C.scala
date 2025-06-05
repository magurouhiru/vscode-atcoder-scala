package abc.`387`

import scala.io.StdIn.readLine
import scala.math.pow

object C {
  def main(args: Array[String]): Unit = {
    val Array(l, r) = readLine().split(" ").map(_.toLong)
    // println(calcSum(l - 1))
    // println(calcSum(r))
    println(calcSum(r) - calcSum(l - 1))
  }
  def toArray(n: Long): Array[Int] = {
    n.toString.map(_.asDigit).toArray
  }
  def calcSum(n: Long): Long = {
    val a = toArray(n)
    // println(a.mkString(","))
    val base1 =
      (1 to 9).flatMap(x => (0 to a.length - 2).map(pow(x, _).toLong)).sum
    val base2 = (1 to a.head - 1).map(pow(_, a.length - 1).toLong).sum
    val base3 =
      if (a.length <= 1) 0L
      else if (a.length <= 2) {
        a.head.min(a(1) + 1).toLong
      } else {
        val b1 = a.drop(2).map(x => a.head.min(x + 1).toLong).product
        val b2 = (a.head.min(a(1) + 1) - 1) * pow(
          a.head,
          a.length - 2
        ).toLong
        b1 + b2
      }
    // println(base1, base2, base3)
    base1 + base2 + base3
  }
}
