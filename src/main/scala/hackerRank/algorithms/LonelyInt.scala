package hackerRank.algorithms

object LonelyInt {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val arr = new Array[Int](n)
    for (arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }

    val lonelyInt = arr.collectFirst {
      case number if arr.count(i => i == number) % 2 == 1 => number
    }

    println(lonelyInt.get)
  }
}
