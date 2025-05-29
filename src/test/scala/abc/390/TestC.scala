package abc.`390`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestC extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        C.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("abc390C_0") {
    val input = """3 5
.#?#.
.?#?.
?...?
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390C_1") {
    val input = """3 3
?##
#.#
##?
"""
    val expectedOutput = """No
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390C_2") {
    val input = """1 1
#
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}