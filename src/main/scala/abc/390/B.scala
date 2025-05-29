package abc.`390`

import scala.io.StdIn.readLine

object B {
  def main(args: Array[String]): Unit = {
    val n = readLine().split(" ").map(_.toInt)
    val ai = readLine().split(" ").map(_.toLong)

    var ans = "Yes"
    for (i <- 0 until ai.length - 2) {
      if (ai(i) * ai(i + 2) != ai(i + 1) * ai(i + 1)) {
        ans = "No"
      }
    }
    println(ans)
  }
}
