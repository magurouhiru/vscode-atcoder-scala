package abc.`408`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestF extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        F.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("abc408F_0") {
    val input = """5 2 1
5 3 1 4 2
"""
    val expectedOutput = """2
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408F_1") {
    val input = """13 3 2
13 7 10 1 9 5 4 11 12 2 8 6 3
"""
    val expectedOutput = """3
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}