package hackerRank.algorithms

object SparseArrays {

  // Complete the matchingStrings function below.
  def matchingStrings(strings: Array[String], queries: Array[String]): Array[Int] = {
    queries.map { query =>
      strings.map { string =>
        if (string == query) 1 else 0
      }.sum
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val stringsCount = stdin.readLine.trim.toInt

    val strings = Array.ofDim[String](stringsCount)

    for (i <- 0 until stringsCount) {
      val stringsItem = stdin.readLine
      strings(i) = stringsItem
    }

    val queriesCount = stdin.readLine.trim.toInt

    val queries = Array.ofDim[String](queriesCount)

    for (i <- 0 until queriesCount) {
      val queriesItem = stdin.readLine
      queries(i) = queriesItem
    }

    val res = matchingStrings(strings, queries)

    println(res.mkString("\n"))
  }
}

