val a = (1 -> 5)
val b = (1 -> 6)
var ll = Seq(a,b)

ll = ll :+ (2->6)

ll.groupBy(_._1).map { case (k,v) => (k,v.map(_._2))}

val x=Option()
x.foldLeft("hello")(_ + _)
