package codility

object LongestCommonString {
  def longestCommonString(s1: String, s2: String) = {
    var longestCommonStr = ""
    if (s1.isEmpty || s2.isEmpty) ""
    else {
      (0 to s1.length - 1) foreach { i=>
        (i to s1.length) foreach { j=>
          val substr = s1.substring(i, j)
          if (s2.contains(substr) && longestCommonStr.length < substr.length) {
            longestCommonStr = substr
          }
        }
      }
      longestCommonStr
    }
  }
}