package day4.피자나눠먹기2

class Solution {
    fun solution(n: Int) = (1..Int.MAX_VALUE).firstOrNull { (it * 6) % n == 0 }!!
}

fun main() {
    val solution = Solution()
    arrayOf(
        6 to 1,
        10 to 5,
        4 to 2,
    ).map { Triple(it.first, it.second, solution.solution(it.first)) }
        .forEach(::println)
    /**
     *  n * k = 피자수 * 6
     *  피자수 = n * k / 6
     *  1 1
     *  2 1
     *  3 1
     *  4 2
     *  5 5
     */
}