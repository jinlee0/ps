package day5.콜라문제

class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        val new = n / a * b
        if(new==0) return 0
        return new + solution(a, b, new + n % a)
    }
}

fun main() {
    val solution = Solution()
    arrayOf(
        Triple(2, 1, 20) to 19,
        Triple(3, 1, 20) to 9,
    ).map { val actual = solution.solution(it.first.first, it.first.second, it.first.third)
        Triple(it.first, it.second, actual) to if(it.second == actual) "O" else "X" }
        .forEach(::println)
}