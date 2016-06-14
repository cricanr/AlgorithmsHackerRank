val a = (1 -> 5)
val b = (1 -> 6)
var ll = Seq(a,b)

ll = ll :+ (2->6)

ll.groupBy(_._1).map { case (k,v) => (k,v.map(_._2))}

val x=Option()
x.foldLeft("hello")(_ + _)

val nums = List(0, 0, 1, 2, 1)
nums.collect {
  case n if nums.count(i => i == n) % 2 == 1 => n
}
