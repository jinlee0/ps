package day4.배열의평균값

class Solution {
    fun solution(numbers: IntArray) = numbers.average()
}

fun main() {
    val solution = Solution()
    arrayOf(
        intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) to 5.5,
        intArrayOf(89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99) to 94.0,
    ).map { Triple(it.first.joinToString(":"), it.second, solution.solution(it.first)) }
        .forEach(::println)
}