package algorithms

import scala.io.StdIn

class BinarySearch {

  def rank(key: Int, a: Seq[Int]): Int = {
    var lo = 0
    var hi = a.size - 1
    while (lo <= hi) {
      val mid = lo + (hi - lo) / 2

      if (key < a(mid)) {
        hi = mid - 1
      }
      else if (key > a(mid)) {
        lo = mid + 1
      } else
        return mid
    }

    -1
  }

  }
