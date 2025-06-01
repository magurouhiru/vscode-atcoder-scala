package abc.`388`

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

  test("abc388G_0") {
    val input = """11
1 1 2 3 4 4 7 10 11 12 20
5
2 5
3 8
7 11
1 2
1 11
"""
    val expectedOutput = """2
3
1
0
5
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388G_1") {
    val input = """24
127 148 170 174 258 311 331 414 416 436 517 523 532 587 591 638 660 748 760 776 837 857 972 984
15
7 11
8 9
8 13
12 15
9 23
1 17
8 12
1 5
6 17
3 7
12 19
13 18
7 22
1 12
14 15
"""
    val expectedOutput = """0
0
0
0
2
6
0
1
1
0
0
0
3
5
0
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}