package abc.`387`

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

  test("abc387D_0") {
    val input = """3 5
.S#.G
.....
.#...
"""
    val expectedOutput = """7
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387D_1") {
    val input = """3 5
..#.G
.....
S#...
"""
    val expectedOutput = """-1
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc387D_2") {
    val input = """8 63
...............................................................
..S...#............................#####..#####..#####..####G..
..#...#................................#..#...#......#..#......
..#####..####...####..####..#..#...#####..#...#..#####..#####..
..#...#..#..#...#..#..#..#..#..#...#......#...#..#..........#..
..#...#..#####..####..####..####...#####..#####..#####..#####..
................#.....#........#...............................
................#.....#........#...............................
"""
    val expectedOutput = """148
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}