package hackerRank.algorithms

object BalancedBrackets {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    var a0 = 0

    def isClosedBracket(left: Char, right: Char): Boolean = {
      val pair = (left, right)
      pair match {
        case ('(', ')') => true
        case ('[', ']') => true
        case ('{', '}') => true
        case _ => false
      }
    }

    def balancedBracket(str: String): Boolean = {
      if (str.isEmpty || str.length % 2 == 1 ) return false
      val stackChars = new scala.collection.mutable.Stack[Char]

        str.foreach { c =>
          if (c == '(' || c == '[' || c == '{') stackChars.push(c) else
          {
            if (stackChars.isEmpty) return false

            val lastSymbol = stackChars.pop()
            if (!isClosedBracket(lastSymbol, c)) return false
          }
        }
      if (stackChars.nonEmpty) return false

      true
    }

    while(a0 < t){
      val expression = sc.next()
      if (balancedBracket(expression))
        println("YES")
      else
        println("NO")

      a0+=1
    }
  }
}