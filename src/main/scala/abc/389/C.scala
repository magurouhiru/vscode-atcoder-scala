package abc.`389`

import scala.io.StdIn.readLine

object C {
  def main(args: Array[String]): Unit = {
    val q = readLine().toInt
    val qi = List.fill(q) {
      readLine().split(" ").map(_.toInt)
    }
    var buf = Array.fill(q + 1)((0L, 0L))
    var iBuf = 1
    var rm = 0L
    var iRm = 1
    for (qii <- qi) {
      qii match {
        case Array(1, x) =>
          buf(iBuf) = (x, buf(iBuf - 1)._2 + x)
          iBuf += 1
        case Array(2) => {
          rm += buf(iRm)._1
          iRm += 1
        }
        case Array(3, k) =>
          println(buf(k - 2 + iRm)._2 - rm)
      }
    }
  }
}
