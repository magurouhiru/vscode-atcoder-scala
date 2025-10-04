package abc.`408`

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

  test("abc408A_0") {
    val input = """5 10
6 11 21 22 30
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408A_1") {
    val input = """2 100
1 200
"""
    val expectedOutput = """No
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408A_2") {
    val input = """10 22
47 81 82 95 117 146 165 209 212 215
"""
    val expectedOutput = """No
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}