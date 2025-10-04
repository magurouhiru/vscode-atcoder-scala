package abc.`408`

import scala.io.StdIn.readLine

object A {
  def main(args: Array[String]): Unit = {
    val Array(n, s) = readLine().split(" ").map(_.toInt)
    val ti = readLine().split(" ").map(_.toInt)

    val max = (0 +: ti)
      .zip(ti)
      .foldLeft(0)((acc, t) => {
        if (acc < (t._2 - t._1)) t._2 - t._1
        else acc
      })
    if (s < max) println("No")
    else println("Yes")
  }
}
