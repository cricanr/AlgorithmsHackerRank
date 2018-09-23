package hackerRank.algorithms

object ArrayManipulation {

  // Complete the arrayManipulation function below.
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    val array = Array.ofDim[Long](n)

    var max: Long = 0
    queries.foreach { query =>
      val lower = query(0) - 1
      val upper = query(1)
      for (i <- lower until upper) {
        array(i) = array(i) + query(2)
        max = if (array(i) > max) array(i) else max
      }
    }

    max
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val nm = stdin.readLine.split(" ")

    val n = nm(0).trim.toInt

    val m = nm(1).trim.toInt

    val queries = Array.ofDim[Int](m, 3)

    for (i <- 0 until m) {
      queries(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = arrayManipulation(n, queries)

    println(result)
  }
}