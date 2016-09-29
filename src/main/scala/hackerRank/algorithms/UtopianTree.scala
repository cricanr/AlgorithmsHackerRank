package hackerRank.algorithms

object UtopianTree {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val t = sc.nextInt()
    var testCases = Seq[Int]()
    if (t<= 10 && t >=1) {
      for (step <- 0 until t) {
        val number = sc.nextInt()
        if (number >= 0 && number <= 60) {
          testCases :+= number
          println(utopianTree(testCases(step)))
        }
      }
    }
    def utopianTree(noCycles: Int) = {
      var h = 1
      for (cycle <- 0 until noCycles) {
        h = if (cycle % 2 == 0) h * 2 else h + 1
      }
      h
    }
  }
}