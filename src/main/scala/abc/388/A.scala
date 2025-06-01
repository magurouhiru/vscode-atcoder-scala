package abc.`388`

import scala.io.StdIn.readLine

object A {
  def main(args: Array[String]): Unit = {
    val s = readLine()
    println((s.head :: "UPC".toList).mkString(""))
  }
}
