package abc.`389`

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

  test("abc389C_0") {
    val input = """7
1 5
1 7
3 2
1 3
1 4
2
3 3
"""
    val expectedOutput = """5
10
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc389C_1") {
    val input = """3
1 1
2
1 3
"""
    val expectedOutput = """"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc389C_2") {
    val input = """10
1 15
1 10
1 5
2
1 5
1 10
1 15
2
3 4
3 2
"""
    val expectedOutput = """20
5
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}