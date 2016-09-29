package hackerRank

object SumNums {
  def main(args: Array[String]) = {
    val sc = new java.util.Scanner(System.in);
    val n = sc.nextInt();
    val a = Array.ofDim[Int](n, n);
    for (a_i <- 0 to n - 1) {
      for (a_j <- 0 to n - 1) {
        a(a_i)(a_j) = sc.nextInt();
      }
    }

    var sumPrimaryDiagonal = 0
    for (i <- 0 to a.length - 1)
      yield sumPrimaryDiagonal = sumPrimaryDiagonal + a(i)(i)

    var sumSecondaryDiagonal = 0
    for (i <- 0 to a.length - 1)
      yield sumSecondaryDiagonal = sumSecondaryDiagonal + a(i)(a.length -1 - i)

    val absSum = Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal)
    println(absSum)
  }
}
