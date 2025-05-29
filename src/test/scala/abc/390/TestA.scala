package abc.`390`

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

  test("abc390A_0") {
    val input = """1 2 4 3 5
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390A_1") {
    val input = """5 3 2 4 1
"""
    val expectedOutput = """No
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390A_2") {
    val input = """1 2 3 4 5
"""
    val expectedOutput = """No
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390A_3") {
    val input = """2 1 3 4 5
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}