package abc.`388`

import scala.io.StdIn.readLine
import scala.collection.immutable.TreeMap
import scala.collection.immutable.ArraySeq

object C {
  def main(args: Array[String]): Unit = {
    val n = readLine().toLong
    val an = readLine().split(" ").map(_.toLong)

    var cnt =
      TreeMap[Long, (Long, Long)](
        an.foldRight(Nil: List[(Long, (Long, Long))]) { (x, ls) =>
          {
            (ls, x) match {
              case (Nil, _) => List((x, (1L, 1L)))
              case (head :: tail, y) if head._1 == y =>
                (y, (head._2._1 + 1L, head._2._2 + 1L)) :: tail
              case (head :: tail, y) =>
                (y, (1L, head._2._2 + 1L)) :: head :: tail
            }
          }
        }: _*
      )

    var ans = cnt.foldLeft(0L) { case (acc, (ai, (ci, _))) =>
      val (_, (_, sj)) =
        cnt.rangeFrom(ai * 2L).headOption.getOrElse((0L, (0L, 0L)))
      acc + (ci * sj)
    }

    println(ans)
  }
}
