package hackerRank.algorithms

import scala.collection.immutable.{ListMap, Queue}
import scala.collection.mutable.ListBuffer

object SnakesAndLadders {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/

    val scanner = new java.util.Scanner(System.in)
    val t = scanner.nextInt()
    val noDices = 6
    for (i <- 0 until t) {
      val n = scanner.nextInt()
      val ladders = readTuples(n)

      ladders.foreach(l => println(s"ll ${l}"))
      val m = scanner.nextInt()
      val snakes = readTuples(m)
      var nodes: Seq[Tuple2[Int, Int]] = Seq.empty
      val tableSize = 100
      for (vertex <- 1 to tableSize) {
        if (ladders.contains(vertex) || snakes.contains(vertex)) Seq.empty else {
          for (dice <- noDices to 1 by -1) {
            val newPos = if (vertex + dice > tableSize) vertex else vertex + dice
            val element = if (ladders.contains(newPos)) vertex -> ladders.get(newPos).get else
            if (snakes.contains(newPos)) vertex -> snakes.get(newPos).get else {
              vertex -> newPos
            }
            println(element)
            nodes = nodes :+ element
          }
        }
      }

      val graph = new Graph[Int]()
      val graphNodes = nodes.groupBy(_._1).map { case (k,v) => (k,v.map(_._2))}
      val sortedgraphNodes = ListMap(graphNodes.toSeq.sortBy(_._1):_*)
      graph.g = sortedgraphNodes
      println("------------------------------------------------------------------")
      graph.g.foreach(edge => println(s"(${edge._1}, ${edge._2}"))

      val graphRun = graph.BFS(1)

      println("------------------------------------------------------------------")
      println("Running BFS on graph starting from node 1:")
      for (m <- graphRun) {
        println(m)
      }

      val shortestPath = graph.BfsShortestPath(1, 100)
      println(s"shortest path: $shortestPath")
    }

    def readTuples(n: Int) = {
      var tuples = Map[Int, Int]()
      for (a_i <- 1 to n) {
        val v1 = scanner.nextInt()
        val v2 = scanner.nextInt()
        println(s"tuple($v1, $v2)")
        tuples = tuples + (v1 -> v2)
      }

      tuples
    }
  }
}

class Graph[T] {
  var g: Map[Int, Seq[Int]] = Map()

  def BFS(start: Int): List[List[Int]] = {
    def BFS0(elems: List[Int], visited: List[List[Int]]): List[List[Int]] = {
      val newNeighbors = elems.flatMap(g(_)).filterNot(visited.flatten.contains).distinct
      if (newNeighbors.isEmpty)
        visited
      else
        BFS0(newNeighbors, newNeighbors :: visited)
    }

    BFS0(List(start), List(List(start))).reverse
  }

  def BfsShortestPath(start: Int, destination: Int): Int = {
    var level = 0

    def BFS0(elems: List[Int], visited: List[List[Int]]): List[List[Int]] = {
      val newNeighbors = elems.flatMap(g(_)).filterNot(visited.flatten.contains).distinct
      if (newNeighbors.isEmpty)
        visited
      else {
        level += 1
        BFS0(newNeighbors, newNeighbors :: visited)
      }
    }

    BFS0(List(start), List(List(start))).reverse
    level
  }
//
//  def breadthFirstSearch(elems: List[Int], start: Int, destination: Int) = {
//
//    // A list that stores the path.
//
//    // If the source is the same as destination, I'm done.
//    if (start == destination) 1
//
//    // A queue to store the visited nodes.
//    val queue = Queue[Int]()
//
//    // A queue to store the visited nodes.
//    var visited = Queue[Int]()
//
//    queue.enqueue(start)
//    while (!queue.isEmpty) {
//      val vertex = queue.dequeue
//      visited = visited.enqueue(vertex)
//
//      val neighboursList = elems.flatMap(g(_)).filterNot(visited.flatten.contains).distinct
//      var index = 0;
//      while (index != neighboursList.size) {
//        val neighbour = neighboursList(index)
//
//        if (neighbour.equals(destination)) {
////          return processPath(source, destination, path);
//        } else {
//          if (!visited.contains(neighbour)) {
//            queue.enqueue(neighbour)
//          }
//        }
//        index = index + 1
//      }
//    }
//
//    -1
//  }

}