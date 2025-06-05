package abc.`387`

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

  test("abc387A_0") {
    val input = """20 25
"""
    val expectedOutput = """2025
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387A_1") {
    val input = """30 25
"""
    val expectedOutput = """3025
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387A_2") {
    val input = """45 11
"""
    val expectedOutput = """3136
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387A_3") {
    val input = """2025 1111
"""
    val expectedOutput = """9834496
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}