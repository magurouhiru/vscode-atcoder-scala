package abc.`390`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestE extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        E.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("abc390E_0") {
    val input = """5 25
1 8 5
2 3 5
2 7 10
3 2 5
3 3 10
"""
    val expectedOutput = """3
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390E_1") {
    val input = """2 5000
1 200000 1
2 200000 1
"""
    val expectedOutput = """0
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}