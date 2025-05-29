package abc.`407`

import scala.io.StdIn.readLine

object A {
  def main(args: Array[String]): Unit = {
    val Array(a, b) = readLine().split(" ").map(_.toDouble)
    val ans = Math.round(a / b)
    println(ans)
  }
}
