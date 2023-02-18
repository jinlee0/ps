package day2.배열두배

class Solution {
    fun solution(numbers: IntArray) = numbers.map{ it * 2 }
}

fun main() {
    val solution = Solution()
    arrayOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(1, 2, 100, -99, 1, 2, 3)
    ).map(solution::solution)
        .forEach { println(it.joinToString(",")) }
}

