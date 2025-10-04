package abc.`408`

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

  test("abc408C_0") {
    val input = """10 4
1 6
4 5
5 10
7 10
"""
    val expectedOutput = """1
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408C_1") {
    val input = """5 2
1 2
3 4
"""
    val expectedOutput = """0
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408C_2") {
    val input = """5 10
2 5
1 5
1 2
2 4
2 2
5 5
2 4
1 2
2 2
2 3
"""
    val expectedOutput = """3
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}