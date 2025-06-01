package abc.`388`

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

  test("abc388E_0") {
    val input = """6
2 3 4 4 7 10
"""
    val expectedOutput = """3
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388E_1") {
    val input = """3
387 388 389
"""
    val expectedOutput = """0
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc388E_2") {
    val input = """24
307 321 330 339 349 392 422 430 477 481 488 537 541 571 575 602 614 660 669 678 712 723 785 792
"""
    val expectedOutput = """6
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}