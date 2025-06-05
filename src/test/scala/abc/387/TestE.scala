package abc.`387`

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

  test("abc387E_0") {
    val input = """5
"""
    val expectedOutput = """8
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387E_1") {
    val input = """21
"""
    val expectedOutput = """-1
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387E_2") {
    val input = """1234
"""
    val expectedOutput = """2024
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387E_3") {
    val input = """1234567890123456789012345678901234567890
"""
    val expectedOutput = """1548651852734633803438094164372911259190
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}