package day2.some

import kotlin.math.floor

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        return floor(num1.toDouble() / num2 * 1000).toInt()
    }
}

fun main() {
    var inputs = arrayOf(
        arrayOf(3, 2),
        arrayOf(7, 3),
        arrayOf(1, 16)
    )
    inputs.map { Solution().solution(it[0], it[1]) }.forEach(::println)
}