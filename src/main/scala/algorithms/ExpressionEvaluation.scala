package algorithms

import scala.collection.mutable

object ExpressionEvaluation {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    val ops = new mutable.Stack[String]()
    val vals = new mutable.Stack[Double]()
    while (sc.next.nonEmpty) {
      val s = sc.next()

      s match {
        case "(" =>
        case "+" => ops.push(s)
        case "-" => ops.push(s)
        case "*" => ops.push(s)
        case "/" => ops.push(s)
        case "sqrt" => ops.push(s)
        case ")" => {
          val op = ops.pop()
          val value = vals.pop()

          val calculatedValue = op match {
            case "+" => vals.pop() + value
            case "-" => vals.pop() - value
            case "*" => vals.pop() * value
            case "/" => vals.pop() / value
            case "sqrt" => Math.sqrt(value)
          }
          vals.push(calculatedValue)
        }
        case _ => vals.push(s.toDouble)
      }
    }

    println(vals.pop)
  }
}