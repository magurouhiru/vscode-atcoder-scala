package abc.`408`

import scala.io.StdIn.readLine

object C {
  def main(args: Array[String]): Unit = {
    val Array(n, m) = readLine().split(" ").map(_.toInt)
    val lri = Array.fill(m)(readLine().split(" ").map(_.toInt))

    var tmp = Array.fill(n + 1)(0)
    lri.foreach { case Array(l, r) =>
      tmp(l - 1) += 1
      tmp(r) -= 1
    }
    val amt = tmp.scanLeft(0)(_ + _).tail.init
    println(amt.min)
  }
}
