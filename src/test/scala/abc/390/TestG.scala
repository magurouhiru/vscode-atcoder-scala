package abc.`390`

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

  test("abc390G_0") {
    val input = """3
"""
    val expectedOutput = """1332
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390G_1") {
    val input = """390
"""
    val expectedOutput = """727611652
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc390G_2") {
    val input = """79223
"""
    val expectedOutput = """184895744
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}