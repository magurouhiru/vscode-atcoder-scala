package abc.`386`

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

  test("abc386E_0") {
    val input = """4 2
3 2 6 4
"""
    val expectedOutput = """7
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc386E_1") {
    val input = """10 4
1516 1184 1361 2014 1013 1361 1624 1127 1117 1759
"""
    val expectedOutput = """2024
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}