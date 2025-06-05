package abc.`387`

import scala.io.StdIn.readLine

object A {
  def main(args: Array[String]): Unit = {
    val Array(a, b) = readLine().split(" ").map(_.toInt)
    val result = (a + b) * (a + b)
    println(result)
  }
}
