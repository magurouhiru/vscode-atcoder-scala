package abc.`390`

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

  test("abc390B_0") {
    val input = """5
3 6 12 24 48
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390B_1") {
    val input = """3
1 2 3
"""
    val expectedOutput = """No
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390B_2") {
    val input = """2
10 8
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}