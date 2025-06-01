package abc.`388`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestB extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        B.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("abc388B_0") {
    val input = """4 3
3 3
5 1
2 4
1 10
"""
    val expectedOutput = """12
15
20
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388B_1") {
    val input = """1 4
100 100
"""
    val expectedOutput = """10100
10200
10300
10400
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}