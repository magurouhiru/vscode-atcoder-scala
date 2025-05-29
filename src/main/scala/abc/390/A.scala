package abc.`390`

import scala.io.StdIn.readLine

object A {
  def main(args: Array[String]): Unit = {
    val ai = readLine().split(" ").map(_.toInt)
    var cnt = 0
    for (i <- 0 until ai.length - 1) {
      if (ai(i) != i + 1) {
        cnt += 1
        val tmp = ai(i)
        ai(i) = ai(i + 1)
        ai(i + 1) = tmp
      }
    }
    if (cnt == 1) {
      println("Yes")
    } else {
      println("No")
    }
  }
}
