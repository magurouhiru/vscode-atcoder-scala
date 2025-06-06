package abc.`386`

import scala.io.StdIn.readLine

object A {
  def main(args: Array[String]): Unit = {
    val abcd = readLine().split(" ").map(_.toInt)

    abcd.groupBy(identity).map(_._2.length) match {
      case List(1, 3) | List(3, 1) => println("Yes")
      case List(2, 2)              => println("Yes")
      case _                       => println("No")
    }
  }
}
