package hackerRank.algorithms

object SockMerchant {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val c = new Array[Int](n)
    for (c_i <- 0 until n) {
      c(c_i) = sc.nextInt()
    }

    val sockSet = c.toSet

    val pairs = sockSet.map(s => (s, c.count(i => i == s))).toMap

    println(pairs.map(p => p._2 / 2).sum)
  }
}
