package hackerRank.algorithms

object JumpingOnClouds {
  private def jumpingOnClouds(c: Array[Int], k: Int): Int = {
    var E = 100
    var i = 0
    var EE = 1
    while (E > 0 && EE != 0) {
      E = E - 1
      c(i) match {
        case 0 =>
          i = (i + k) % c.length
        case 1 =>
          E = E - 2
          i = (i + k) % c.length
      }
      println("cloud visited: " + i)
      if (i == 0) EE = 0
    }

    E
  }

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val c = new Array[Int](n)
    for (c_i <- 0 until n) {
      c(c_i) = sc.nextInt()
    }

    val result = jumpingOnClouds(c, k)
    println(result)
  }
}
