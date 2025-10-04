package abc.`408`

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

  test("abc408G_0") {
    val input = """5
3 2 2 1
5 2 8 3
1 2 2 1
60 191 11 35
40 191 71 226
"""
    val expectedOutput = """3
5
1
226
4
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}