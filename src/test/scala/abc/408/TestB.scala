package abc.`408`

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

  test("abc408B_0") {
    val input = """4
3 1 4 1
"""
    val expectedOutput = """3
1 3 4
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408B_1") {
    val input = """3
7 7 7
"""
    val expectedOutput = """1
7
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408B_2") {
    val input = """8
19 5 5 19 5 19 4 19
"""
    val expectedOutput = """3
4 5 19
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}