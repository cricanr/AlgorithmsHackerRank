package hackerRank.algorithms

object CamelCase {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val s = sc.next()

    val count = s.count(_.isUpper) + 1
    println(count)
  }
}
