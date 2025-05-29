package abc.`407`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestA extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        A.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("sample 0") {
    val input = """1 2
"""
    val expectedOutput = """1
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

  test("sample 1") {
    val input = """407 29
"""
    val expectedOutput = """14
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

  test("sample 2") {
    val input = """22 11
"""
    val expectedOutput = """2
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }
}
