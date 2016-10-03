import scala.collection.immutable.Stack

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


val t = 3
val ar = "a"

val stackChars = Stack.empty
val s = stackChars.push('c')
s.pop2._1
//
//
//ar.forall(c => c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}')

//def balanceBracket(str: String): String = {
//  val index = ar.length/2-1
//  val sub1 = ar.substring(0, index)
//  val sub2 = ar.substring(index + 2)
//  val balanced = if (ar(index) == '(' && ar(index+1) == ')' ||
//    ar(index) == '[' && ar(index+1) == ']' ||
//    ar(index) == '{' && ar(index+1) == '}') sub1 + sub2 else
//    ar
//
//  if (balanced.isEmpty) "YES" else
//  if (balanced == ar) "NO" else {
//    balanceBracket(balanced)
//  }
//}
//
//balanceBracket(ar)