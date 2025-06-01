package abc.`389`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestG extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        G.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("abc389G_0") {
    val input = """4 998244353
"""
    val expectedOutput = """12 9 3 0
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc389G_1") {
    val input = """6 924844033
"""
    val expectedOutput = """810 2100 3060 3030 2230 1210 450 100 10 0 0
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc389G_2") {
    val input = """10 433416647
"""
    val expectedOutput = """49218750 419111280 321937732 107111441 372416570 351559278 312484809 334285827 317777667 211471846 58741385 422156135 323887465 54923551 121645733 94354149 346849276 72744827 385773306 163421544 351691775 59915863 430096957 166653801 346330874 185052506 245426328 47501118 7422030 899640 79380 4536 126 0 0 0 0
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}