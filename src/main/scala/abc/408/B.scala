package abc.`408`

import scala.io.StdIn.readLine

object B {
  def main(args: Array[String]): Unit = {
    val Array(n) = readLine().split(" ").map(_.toInt)
    val ai = readLine().split(" ").map(_.toInt)

    val tmp = ai.toSet.toArray.sorted
    println(tmp.length)
    println(tmp.mkString(" "))
  }
}
