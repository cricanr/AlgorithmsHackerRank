package hackerRank.algorithms

object BeautifulDays {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val i = sc.nextInt()
    val j = sc.nextInt()
    val k = sc.nextInt()

    def reverse(number: Int): Int = number.toString.reverse.toInt

    def beautifulDay(day: Int, k: Int): Boolean = {
      Math.abs(day - reverse(day)) % k == 0
    }

    val days = i to j

    val beautifulDays = days.count(day => beautifulDay(day, k))
    println(beautifulDays)
  }
}
