package abc.`388`

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

  test("abc388A_0") {
    val input = """Kyoto
"""
    val expectedOutput = """KUPC
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388A_1") {
    val input = """Tohoku
"""
    val expectedOutput = """TUPC
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}