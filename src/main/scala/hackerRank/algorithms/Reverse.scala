package hackerRank.algorithms

object Reverse {
  def main(args: Array[String]): Unit = {
    val list = List(4, 1, 21, 5, 3)
    val reversedList = rev(list)

    println(s"list: $list reversed is: $reversedList")
  }

  def rev(arr: List[Int]): List[Int] = arr.foldLeft(List[Int]()) { case (r, h) => h :: r }
}


