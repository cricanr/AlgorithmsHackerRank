package hackerRank.algorithms

/*
Colleen is having a birthday! She will have a cake with one candle for each year of her age. When she blows out the candles, she’ll only be able to blow out the tallest ones.

Find and print the number of candles she can successfully blow out.

Input Format

The first line contains a single integer, , denoting the number of candles on the cake.
The second line contains  space-separated integers, where each integer  describes the height of candle .

Constraints

Output Format
Print the number of candles the can be blown out on a new line.

Sample Input 0

4
3 2 1 3
Sample Output 0

2
Explanation 0

The maximum candle height is 3 and there are two candles of that height.

 */


object BirthdayCakeCandles {
  def birthdayCakeCandles(n: Int, ar: Array[Int]): Int =  {
    ar.distinct.map(candle => ar.count(_ == candle)).max
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val ar = new Array[Int](n)
    for(ar_i <- 0 until n) {
      ar(ar_i) = sc.nextInt()
    }
    val result = birthdayCakeCandles(n, ar)
    println(result)
  }
}