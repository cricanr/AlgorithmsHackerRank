/**
  * Created by radu on 09.02.17.
  */
object PairSumsValue {
  //Given an array of int and a target number, how to find two numbers in the array whose sum equals the target.
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    var arr = new Array[Int](n)
    for (arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }
    val targetNumber = sc.nextInt()
    for (i <- 0 until n - 1) {
      for (j <- 1 until n) {
        if (arr(i) + arr(j) == targetNumber) return println((arr(i), arr(j)))
      }
    }
  }
}