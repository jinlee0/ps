package day4.피자나눠먹기1

import kotlin.math.ceil

class Solution {
    fun solution(n: Int) = ceil(n / 7.0).toInt()
}

fun main() {
    val solution = Solution()
    arrayOf(
        arrayOf(7, 1),
        arrayOf(1, 1),
        arrayOf(15, 3),
        arrayOf(14, 2),
    ).map { Triple("input" to it.first(), "expected" to it.last(), "actual" to solution.solution(it.first())) }
        .forEach{println(it)}
}

/**
 * 1 1
 * 2 1
 * 3 1
 * 4 1
 * 5 1
 * 6 1
 * 7 1
 * 8 2
 * 9 2
 * 10 2
 * 11 2
 * 12 2
 * 13 2
 * 14 2
 * 15 3
 * 16
 * 17
 * 18
 * 19
 * 20
 * 21 3
 */