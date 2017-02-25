package hackerRank.algorithms

object RepeatedString {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val s = sc.next()
    val n = sc.nextLong()

    val strLen = s.length
    val availableLength = n - strLen
    val repetitions = (availableLength / strLen).toInt
    val remainderPos = (availableLength % strLen).toInt

    val str = s"$s${(for (i <- 0 until repetitions) yield s).mkString("")}${s.substring(0, remainderPos)}"
    println(str.count(ch => ch == 'a'))
  }
}
