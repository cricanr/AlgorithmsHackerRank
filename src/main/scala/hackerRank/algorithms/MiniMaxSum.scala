package hackerRank.algorithms

object MiniMaxSum {
  def main(args: Array[String]) {
    def remove(num: Double, list: Seq[Double]) = list diff List(num)

    val sc = new java.util.Scanner(System.in)
    val arr = new Array[Double](5)
    val seq = arr.toSeq
    for (arr_i <- 0 to 4) {
      arr(arr_i) = sc.nextDouble()
    }

    var min = Double.MaxValue
    var max = Double.MinValue
    for (arr_i <- 0 to 4) {
      val currentSum = remove(seq(arr_i), seq).sum
      min = if (min > currentSum) currentSum else min
      max = if (max < currentSum) currentSum else max
    }

    println(f"$min%.0f $max%.0f")
  }
}
