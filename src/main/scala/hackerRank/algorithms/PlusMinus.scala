package hackerRank

object PlusMinus {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val arr = new Array[Int](n)
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt()
    }

    val posFraction = BigDecimal(arr.count(_ > 0).toFloat / n).setScale(6, BigDecimal.RoundingMode.HALF_EVEN)
    val zeroFraction = BigDecimal(arr.count(_ == 0).toFloat / n).setScale(6,BigDecimal.RoundingMode.HALF_EVEN)
    val negFraction = BigDecimal(arr.count(_ < 0).toFloat / n).setScale(6, BigDecimal.RoundingMode.HALF_EVEN)

    println(posFraction)
    println(negFraction)
    println(zeroFraction)
  }
}