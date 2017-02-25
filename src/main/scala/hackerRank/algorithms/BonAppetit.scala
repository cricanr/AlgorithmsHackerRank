package hackerRank.algorithms

object BonAppetit {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val k = sc.nextInt()

    val meals = for (i <- 0 until n) yield sc.nextInt()
    val requestedBill = sc.nextInt
    val mealsEatenByAnna = meals.filter(meal => meals.indexOf(meal) != k).sum
    val annasRealsBill = mealsEatenByAnna / 2
//    val actualBill = meals.collect {
//      case meal if meals.indexOf(meal) != k => meal
//    }.sum / 2
    val diff = requestedBill - annasRealsBill
//    println(s"Requested bill: $requestedBill ; actual bill: $actualBill ; diff: $diff" )

    println(if (diff == 0) "Bon Appetit" else diff)
  }
}