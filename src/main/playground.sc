//val a = (1 -> 5)
//val b = (1 -> 6)
//var ll = Seq(a,b)
//
//ll = ll :+ (2->6)
//
//ll.groupBy(_._1).map { case (k,v) => (k,v.map(_._2))}
//
//val x=Option()
//x.foldLeft("hello")(_ + _)
//
//val nums = List(0, 0, 1, 2, 1)
//nums.collect {
//  case n if nums.count(i => i == n) % 2 == 1 => n
//}

//
//val sc = new java.util.Scanner(System.in);
//val n = sc.nextInt()
//val k = sc.nextInt()
//val a = new Array[Int](n)
//for (a_i <- 0 until n) {
//  a(a_i) = sc.nextInt()
//}
val a = Array(1,2,3,4,5)
val d = 4
def rotateView(d: Int) : Array[Int] = {
  a.drop(d) ++ a.take(d)
}

val rotated = rotateView(d)
rotated.foreach(i => print(i + " "))
