package abc.`386`

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

  test("abc386D_0") {
    val input = """4 3
4 1 B
3 2 W
1 3 B
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc386D_1") {
    val input = """2 2
1 2 W
2 2 B
"""
    val expectedOutput = """No
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc386D_2") {
    val input = """1 1
1 1 W
"""
    val expectedOutput = """Yes
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc386D_3") {
    val input = """2289 10
1700 1083 W
528 967 B
1789 211 W
518 1708 W
1036 779 B
136 657 B
759 1497 B
902 1309 B
1814 712 B
936 763 B
"""
    val expectedOutput = """No
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}