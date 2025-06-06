package abc.`386`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestG extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        G.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("abc386G_0") {
    val input = """3 2
"""
    val expectedOutput = """21
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc386G_1") {
    val input = """2 100
"""
    val expectedOutput = """5050
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc386G_2") {
    val input = """20 24
"""
    val expectedOutput = """707081320
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}