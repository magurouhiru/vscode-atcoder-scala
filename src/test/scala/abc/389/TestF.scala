package abc.`389`

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

  test("abc389F_0") {
    val input = """5
1 5
1 3
3 6
2 4
4 7
3
3
2
5
"""
    val expectedOutput = """6
6
8
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc389F_1") {
    val input = """10
1 1999
1 1999
1200 2399
1 1999
1 1999
1 1999
2000 500000
1 1999
1 1999
1600 2799
7
1
1995
2000
2399
500000
2799
1000
"""
    val expectedOutput = """8
2002
2003
2402
500001
2800
1007
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }


  test("abc389F_2") {
    val input = """15
260522 414575
436426 479445
148772 190081
190629 433447
47202 203497
394325 407775
304784 463982
302156 468417
131932 235902
78537 395728
223857 330739
286918 329211
39679 238506
63340 186568
160016 361868
10
287940
296263
224593
101449
336991
390310
323355
177068
11431
8580
"""
    val expectedOutput = """287946
296269
224599
101453
336997
390315
323363
177075
11431
8580
"""
    val actualOutput = runWithIO(input)
    assertEquals(actualOutput, expectedOutput)
  }

}