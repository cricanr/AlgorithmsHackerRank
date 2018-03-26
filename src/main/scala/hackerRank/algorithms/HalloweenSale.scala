package hackerRank.algorithms

object HalloweenSale {

  def howManyGames(p: Int, d: Int, m: Int, s: Int): Int = {
    var remaining = s
    var noOfGames = 0
    if (p < s) {
      remaining = s - p
      noOfGames = noOfGames + 1
      var cost = p
      while (remaining >= 0) {
        cost = if (cost - d > m) cost - d else m
        remaining = remaining - cost
        noOfGames = noOfGames + (if (remaining >= 0) 1 else 0)
      }
    }
    noOfGames
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val p = sc.nextInt()
    val d = sc.nextInt()
    val m = sc.nextInt()
    val s = sc.nextInt()
    val answer = howManyGames(p, d, m, s)
    println(answer)
  }
}