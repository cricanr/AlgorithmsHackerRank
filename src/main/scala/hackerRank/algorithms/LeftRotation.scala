package hackerRank.algorithms

object LeftRotation {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val nd = stdin.readLine.split(" ")

    val n = nd(0).trim.toInt

    val d = nd(1).trim.toInt

    val a = stdin.readLine.split(" ").map(_.trim.toInt)

    var leftRotatedArray = new Array[Int](n)
    for (i <- a.indices) {
      leftRotatedArray((i + (n - d)) % n) = a(i)
    }

    leftRotatedArray.foreach { item => print(s"$item ")}
  }
}
