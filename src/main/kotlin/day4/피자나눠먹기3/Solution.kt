package day4.피자나눠먹기3

import kotlin.math.ceil

class Solution {
    fun solution(slice: Int, n: Int)= ceil(n.toDouble() / slice)
}

fun main() {
    val solution = Solution()
    arrayOf(
        7 to 10 to 2,
        4 to 12 to 3,
    ).map { Triple(it.first, it.second, solution.solution(it.first.first, it.first.second)) }
        .forEach(::println)
}