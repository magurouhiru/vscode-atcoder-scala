package abc.`387`

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

  test("abc387C_0") {
    val input = """97 210
"""
    val expectedOutput = """6
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387C_1") {
    val input = """1000 9999
"""
    val expectedOutput = """2025
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387C_2") {
    val input = """252509054433933519 760713016476190692
"""
    val expectedOutput = """221852052834757
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}