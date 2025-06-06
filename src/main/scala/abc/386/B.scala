package abc.`386`

import scala.io.StdIn.readLine

object B {
  def main(args: Array[String]): Unit = {
    val s = readLine()
    val cnt = s
      .foldLeft((false, 0))((acc, si) => {
        if (si == '0') {
          if (acc._1) {
            (false, acc._2 + 1)
          } else {
            (true, acc._2)
          }
        } else {
          (false, acc._2)
        }
      })
      ._2
    println(s.length - cnt)
  }
}
