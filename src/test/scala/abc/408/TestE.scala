package abc.`408`

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

  test("abc408E_0") {
    val input = """4 5
1 2 1
1 3 4
2 3 2
2 4 4
3 4 3
"""
    val expectedOutput = """3
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408E_1") {
    val input = """3 5
1 2 1
1 2 2
1 2 3
1 2 4
2 3 4
"""
    val expectedOutput = """4
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc408E_2") {
    val input = """8 12
4 5 16691344
5 7 129642441
2 7 789275447
3 8 335307651
3 5 530163333
5 6 811293773
3 8 333712701
1 2 2909941
2 3 160265478
5 7 465414272
1 3 903373004
6 7 408299562
"""
    val expectedOutput = """468549631
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}