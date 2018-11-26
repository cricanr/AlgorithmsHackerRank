package hackerRank.algorithms

object EqualStacks {

  /*
   * Complete the equalStacks function below.
   */
  def equalStacks(h1: Array[Int], h2: Array[Int], h3: Array[Int]): Int = {
    val min = List(h1.length, h2.length, h3.length).min
    var sumHeights = List(0, 0, 0)
    for (i <- 0 to min) {
      if (h1(i) == h2(i) == h3(i)) h1(i) else {
        sumHeights
      }
    }

    ???
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n1N2N3 = stdin.readLine.split(" ")

    val n1 = n1N2N3(0).trim.toInt

    val n2 = n1N2N3(1).trim.toInt

    val n3 = n1N2N3(2).trim.toInt

    val h1 = stdin.readLine.split(" ").map(_.trim.toInt)

    val h2 = stdin.readLine.split(" ").map(_.trim.toInt)

    val h3 = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = equalStacks(h1, h2, h3)

    println(result)
  }
}