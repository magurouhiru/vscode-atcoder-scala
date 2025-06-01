package abc.`388`

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

class TestF extends munit.FunSuite {
  def runWithIO(input: String): String = {
    val inputStream = new ByteArrayInputStream(input.getBytes)
    val outputStream = new ByteArrayOutputStream()
    Console.withIn(inputStream) {
      Console.withOut(new PrintStream(outputStream)) {
        F.main(args = Array.empty[String])
      }
    }
    outputStream.toString
  }

  test("abc388F_0") {
    val input = """24 2 3 5
7 8
17 20
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388F_1") {
    val input = """30 1 5 8
4 24
"""
    val expectedOutput = """No
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388F_2") {
    val input = """100 4 10 11
16 18
39 42
50 55
93 99
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}