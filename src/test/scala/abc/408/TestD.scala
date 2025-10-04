package abc.`408`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestD extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        D.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("abc408D_0") {
    val input = """3
5
10011
10
1111111111
7
0000000
"""
    val expectedOutput = """1
0
0
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408D_1") {
    val input = """5
2
01
10
1000010011
12
111100010011
3
111
8
00010101
"""
    val expectedOutput = """0
2
3
0
2
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}