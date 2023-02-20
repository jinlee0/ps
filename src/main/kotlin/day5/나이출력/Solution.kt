package day5.나이출력

class Solution {
    fun solution(age: Int) = 2022 - age + 1
}

fun main() {
    val solution = Solution()
    arrayOf(
        40 to 1983,
        23 to 2000,
    ).map { val actual = solution.solution(it.first)
        Triple(it.first, it.second, actual) to if (it.second == actual) "O" else "X"
    }.forEach(::println)
}