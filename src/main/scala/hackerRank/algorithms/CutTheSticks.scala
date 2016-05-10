package hackerRank.algorithms

object CutTheSticks {
  
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    var arr = new Array[Int](n)
    for(arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }

    while (!arr.isEmpty) {
      arr = arr.map(i => i - arr.min)
      println(arr.length)
      arr = arr.filter(_ > 0)
    }
  }
}
