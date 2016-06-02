package hackerRank.algorithms

object SortingIntro {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
    val scanner = new java.util.Scanner(System.in)
    val v = scanner.nextInt()
    val n = scanner.nextInt()
    val arr = new Array[Int](n)
    for (i <- 0 until n) arr(i) =  scanner.nextInt()

    println()
    System.out.print(arr.indexOf(v))
  }
}
