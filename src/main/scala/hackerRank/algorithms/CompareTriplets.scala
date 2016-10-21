package hackerRank.algorithms

object CompareTriplets {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val a0 = sc.nextInt()
    val a1 = sc.nextInt()
    val a2 = sc.nextInt()
    val b0 = sc.nextInt()
    val b1 = sc.nextInt()
    val b2 = sc.nextInt()

    def givePoint(val1: Int, val2: Int): (Int, Int) = {
      if (val1 > val2 ) (1, 0) else
      if (val1 < val2) (0, 1) else
        (0, 0)
    }

    val c = Seq(a0 -> b0, a1 -> b1, a2 -> b2)
    val points = c.map { case (i, j) =>
      givePoint(i, j)
    }

    val summedPoints = points.foldLeft((0, 0)) {
      case ((accA, accB), (a, b)) => (accA + a, accB + b)
    }

    println(s"""${summedPoints._1} ${summedPoints._2}""")
  }
}