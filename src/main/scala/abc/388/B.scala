package abc.`388`

import scala.io.StdIn.readLine

object B {
  def main(args: Array[String]): Unit = {
    val Array(n, d) = readLine().split(" ").map(_.toInt)
    val tln = Array.fill(n)(readLine().split(" ").map(_.toInt))

    val ans = (1 to d).map((x) => {
      tln.foldLeft(0)((acc, tli) => acc.max(tli(0) * (tli(1) + x)))
    })
    println(ans.mkString("\n"))
  }
}
