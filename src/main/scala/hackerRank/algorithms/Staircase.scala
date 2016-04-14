package hackerRank

object Staircase {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val n = sc.nextInt();
    for (step <- n-1 to 0 by -1) {
      for (spaces <- step-1 to 0 by -1) {
        print(" ")
      }
      for (k <- n-1 to step by -1) {
        print("#")
      }
      println("")
    }
  }
}
