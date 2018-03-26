package hackerRank.algorithms

object CatsAndAMouse {

  def catAndMouse(x: Int, y: Int, z: Int): String = {
    val catADist = Math.abs(z - x)
    val catBDist = Math.abs(z - y)

    if (catADist < catBDist) "Cat A" else if (catBDist < catADist) "Cat B" else "Mouse C"
  }


  def main(args: Array[String]) {
    val scan = scala.io.StdIn

    val q = scan.readLine.trim.toInt

    for (_ <- 1 to q) {
      val xyz = scan.readLine.split(" ")

      val x = xyz(0).trim.toInt

      val y = xyz(1).trim.toInt

      val z = xyz(2).trim.toInt

      val result = catAndMouse(x, y, z)

      println(result)
    }
  }
}