package abc.`388`

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

  test("abc388D_0") {
    val input = """4
5 0 9 3
"""
    val expectedOutput = """2 0 10 5
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388D_1") {
    val input = """5
4 6 7 2 5
"""
    val expectedOutput = """0 4 7 4 9
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388D_2") {
    val input = """10
2 9 1 2 0 4 6 7 1 5
"""
    val expectedOutput = """0 2 0 0 0 4 7 10 4 10
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}