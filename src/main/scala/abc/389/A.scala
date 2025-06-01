package abc.`389`

import scala.io.StdIn.readLine

object A {
  def main(args: Array[String]): Unit = {
    val s = readLine().split("x").map(_.toInt)
    println(s(0) * s(1))
  }
}
