package day3.짝수는싫어요

class Solution {
    fun solution(n: Int) = n.let { if(it % 2 == 0) it - 1 else it }
        .let { (1 .. it step 2) }.toList()
    fun solution2(n: Int) = (0..n).filter { it%2==1 }
}

fun main() {
    arrayOf(
        arrayOf(10,     1, 3, 5, 7, 9),
        arrayOf(15,     1, 3, 5, 7, 9, 11, 13, 15),
    ).map { Solution().solution(it.first()) }
        .forEach(::println)
}