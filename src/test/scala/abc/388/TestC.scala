package abc.`388`

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

  test("abc388C_0") {
    val input = """6
2 3 4 4 7 10
"""
    val expectedOutput = """8
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388C_1") {
    val input = """3
387 388 389
"""
    val expectedOutput = """0
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388C_2") {
    val input = """32
1 2 4 5 8 10 12 16 19 25 33 40 50 64 87 101 149 175 202 211 278 314 355 405 412 420 442 481 512 582 600 641
"""
    val expectedOutput = """388
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}