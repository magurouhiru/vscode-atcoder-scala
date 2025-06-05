package abc.`387`

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

  test("abc387B_0") {
    val input = """1
"""
    val expectedOutput = """2024
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387B_1") {
    val input = """11
"""
    val expectedOutput = """2025
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387B_2") {
    val input = """24
"""
    val expectedOutput = """1929
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}