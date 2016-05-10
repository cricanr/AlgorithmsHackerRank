package hackerRank.algorithms

object ServiceLanes {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val t = sc.nextInt()
    val width = new Array[Int](n)
    for (width_i <- 0 to n - 1) {
      width(width_i) = sc.nextInt()
    }
    var a0 = 0
    while (a0 < t) {
      val i = sc.nextInt()
      val j = sc.nextInt()
      a0 += 1

      var min = width(i)
      for (index <- i + 1 to j) {
        if (width(index) < min) min = width(index)
      }

      println(min)
    }
  }
}
