package _0222.순서쌍의개수

import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        var count = 0
        val sqrtDouble = sqrt(n.toDouble())
        val sqrtInt = sqrtDouble.toInt()
        (1 ..sqrtInt).forEach {
            if (n % it == 0) {
                count += 2
            }
        }
        return if(sqrtDouble == sqrtInt.toDouble()) --count else count
    }
}

fun main() {
    val solution = Solution()
    arrayOf(
        20 to 6,
        100 to 9,
    ).map { Triple(it.first, it.second, solution.solution(it.first)) }
        .forEach(::println)
    arrayOf(
        1,
        1000000
    ).map { it to solution.solution(it) }
        .forEach(::println)
}