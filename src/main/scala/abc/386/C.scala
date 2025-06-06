package abc.`386`

import scala.io.StdIn.readLine

object C {
  def main(args: Array[String]): Unit = {
    val k = readLine().toInt
    val s = readLine()
    val t = readLine()

    val (long, short) = if (s.length - t.length > 0) (s, t) else (t, s)
    if (long.length - short.length > k) {
      println("No")
    } else if (long.length == short.length) {
      long
        .zip(short)
        .foldLeft(0)((acc, lsi) => {
          if (lsi._1 == lsi._2) acc else acc + 1
        }) match {
        case x if x <= k => println("Yes")
        case _           => println("No")
      }
    } else {
      val i = long
        .zipAll(short, '!', '?')
        .zipWithIndex
        .foldLeft(-1)((acc, lsi) => {
          if (acc > -1) acc
          else if (lsi._1._1 == lsi._1._2) acc
          else lsi._2
        })

      if (long.slice(i + 1, long.length) == short.slice(i, short.length)) {
        println("Yes")
      } else {
        println("No")
      }
    }
  }
}
