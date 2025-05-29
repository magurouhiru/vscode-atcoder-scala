package abc.`390`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestD extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        D.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("abc390D_0") {
    val input = """3
2 5 7
"""
    val expectedOutput = """3
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390D_1") {
    val input = """2
100000000000000000 100000000000000000
"""
    val expectedOutput = """2
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390D_2") {
    val input = """6
71 74 45 34 31 60
"""
    val expectedOutput = """84
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}