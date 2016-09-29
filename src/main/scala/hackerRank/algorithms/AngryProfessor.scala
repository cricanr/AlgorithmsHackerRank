package hackerRank.algorithms

object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var t = sc.nextInt();
    var a0 = 0;
    val answers = Seq[Boolean]()
    while(a0 < t){
      var n = sc.nextInt();
      var k = sc.nextInt();
      var a = new Array[Int](n);
      for(a_i <- 0 to n-1) {
        a(a_i) = sc.nextInt();
      }
      a0 += 1;

      println(if (!(a.count(i => i <= 0) >= k)) "YES" else "NO")
    }
  }
}
