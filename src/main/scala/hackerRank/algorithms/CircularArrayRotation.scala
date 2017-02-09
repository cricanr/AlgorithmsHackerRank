package hackerRank.algorithms

object CircularArrayRotation {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val q = sc.nextInt()
    val a = new Array[Int](n)
    for (a_i <- 0 until n) {
      a(a_i) = sc.nextInt()
    }

    for (_ <- 0 until q) {
      val m = sc.nextInt()
      println(a((n + m - k) % n))
    }
  }
}
