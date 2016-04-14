package hackerRank

object TimeConversion {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val time = sc.next()
    val hours = time.take(2)
    val intHours = hours.toInt
    assert(intHours >= 1 && intHours <= 12)
    val amOrPm = time.takeRight(2)
    val hoursMilitary = if (amOrPm == "AM") {
      if (intHours == 12) "00" else hours.toString
    } else {
      if (intHours.equals(12) && amOrPm.equals("PM")) "12" else (intHours + 12).toString
    }

    println(s"$hoursMilitary:${time.substring(hours.length+1, 8)}")
  }
}
