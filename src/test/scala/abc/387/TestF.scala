package abc.`387`

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

  test("abc387F_0") {
    val input = """3 3
2 1 1
"""
    val expectedOutput = """6
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387F_1") {
    val input = """4 9
1 1 1 1
"""
    val expectedOutput = """2025
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387F_2") {
    val input = """10 5
9 4 5 5 4 2 1 5 7 2
"""
    val expectedOutput = """10010
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}