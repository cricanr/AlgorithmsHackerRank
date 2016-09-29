package codility

/*
The equilibrium index of a sequence is an index such that the sum of elements at lower indexes is equal
to the sum of elements at higher indexes. For example, in a sequence A:
A[0]=-7 A[1]=1 A[2]=5 A[3]=2 A[4]=-4 A[5]=3 A[6]=0
3 is an equilibrium index, because:
A[0]+A[1]+A[2]=A[4]+A[5]+A[6]
6 is also an equilibrium index, because:
A[0]+A[1]+A[2]+A[3]+A[4]+A[5]=0
(The sum of zero elements is zero) 7 is not an equilibrium index - because it is not a valid index
of sequence A. If you still have doubts, here is a precise definition: The integer k is an equilibrium
index of a sequence A[0],A[1]..,A[n-1] if and only if 0<= k and sum(A[0..(k-1)])=sum(A[(k+1)..(n-1)]).
Assume the sum of zero elements is equal to zero.

Write a function
int equi(int A[], int n)
that, given a sequence, returns its equilibrium index (any) or -1 if no equilibrium index exists.
Assume that the sequence may be very long.
 */

object Equilibrium {
  def solution(A: Array[Int]): Int = {
    equi(A, A.size)
  }

  def equi(arr: Array[Int], n: Int): Int = {
    if (n == 0) return -1

    val sum = arr.fold(0)(_+_)

    var sum_left = 0
    arr.foreach { current =>
      val sum_right = sum - sum_left - current
      if (sum_right == sum_left) return arr.indexOf(current)
      sum_left = sum_left + current
    }
    return -1
  }
}
