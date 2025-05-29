package abc.`390`

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

  test("abc390F_0") {
    val input = """4
1 3 1 4
"""
    val expectedOutput = """16
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390F_1") {
    val input = """5
3 1 4 2 4
"""
    val expectedOutput = """23
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390F_2") {
    val input = """10
5 1 10 9 2 5 6 9 1 6
"""
    val expectedOutput = """129
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}