package hackerRank.algorithms

object CounterGame {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    var n = sc.nextLong()

    def isNPowOfN(n: Long) = Math.log(n) / Math.log(2) % 2 == 1
    def largestPow(n: Long) = Math.round(Math.pow(2, Math.floor(Math.log(n) / Math.log(2))).toLong)
    def playCounterGame: Unit = {
      if (n == 1) println("Richard")

      var moveNo: Int = 0
      while (n != 1) {
        if (!isNPowOfN(n)) {
          n = n - largestPow(n)
        } else {
          n = n / 2
        }
        moveNo = moveNo + 1
      }

      if (n == 1) {
        println(if (moveNo % 2 == 0) "Richard" else "Louise")
      }
    }

    for (i <- 0 until t) {
      playCounterGame
    }
  }
}