package day5.아이스아메리카노

class Solution {
    fun solution(money: Int)= intArrayOf(money / 5500, money % 5500)
}

fun main() {
    val solution = Solution()
    arrayOf(
        5500 to intArrayOf(1, 0),
        15000 to intArrayOf(2, 4000),
    ).map { val actual = solution.solution(it.first)
        Triple(it.first, it.second.joinToString(":"), actual) to if (it.second.contentEquals(actual)) "O" else "X"
    }.forEach(::println)
}

