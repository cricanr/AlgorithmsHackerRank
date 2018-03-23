package hackerRank.algorithms

object CoinChange {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    val m = sc.nextInt()
    val c = new Array[Long](m)
    for(c_i <- 0 until m) {
      c(c_i) = sc.nextLong()
    }

    if (n == 0) 0 else
      if (m == 0) 0 else for (_ <- 0 until m) {
        for (_ <- 1 to m) {

        }
      }

    // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
  }
}
