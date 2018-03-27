package hackerRank.algorithms

object TimeInWorlds {
  def timeInWords(h: Int, m: Int): String = {
    val numbers = Map(0 -> "zero", 1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five", 6 -> "six", 7 -> "seven", 8 -> "eight", 9 -> "nine", 10 -> "ten",
      11 -> "eleven", 12 -> "twelve", 13 -> "thirteen", 14 -> "fourteen", 15 -> "fifteen", 16 -> "sixteen", 17 -> "seventeen", 18 -> "eighteen", 19 -> "nineteen",
      20 -> "twenty", 21 -> "twenty one", 22 -> "twenty two", 23 -> "twenty three", 24 -> "twenty four", 25 -> "twenty five", 26 -> "twenty six", 27 -> "twenty seven",
      28 -> "twenty eight", 29 -> "twenty nine")


    (h, m) match {
      case (hour, minutes) if minutes == 0 => s"${numbers.getOrElse(hour, "")} o' clock"
      case (hour, minutes) if minutes == 15 => s"quarter past ${numbers.getOrElse(hour, "")}"
      case (hour, minutes) if minutes == 45 => s"quarter to ${numbers.getOrElse(hour + 1, "")}"
      case (hour, minutes) if minutes == 30 => s"half past ${numbers.getOrElse(hour , "")}"
      case (hour, minutes) if minutes >= 1 && m <= 30 && minutes != 15 => s"${numbers.getOrElse(minutes, "")} ${getMinuteString(minutes)} past ${numbers.getOrElse(hour, "")}"
      case (hour, minutes) if m > 30 & minutes != 45 => s"${numbers.getOrElse(60 - minutes, "")} ${getMinuteString(minutes)} to ${numbers.getOrElse(hour + 1, "")}"
    }
  }

  private def getMinuteString(minutes: Int) = {
    if (minutes > 1) "minutes" else "minute"
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val h = sc.nextInt()
    val m = sc.nextInt()
    val result = timeInWords(h, m)
    println(result)
  }
}