package hackerRank.algorithms

object ArrayLeftRotation {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = new Array[Int](n)
    for (a_i <- 0 until n) {
      a(a_i) = sc.nextInt()
    }

    def rotateView(d: Int) : Array[Int] = {
      a.drop(d) ++ a.take(d)
    }

    val rotated = rotateView(k)
    rotated.foreach(i => print(i + " "))
  }
}
