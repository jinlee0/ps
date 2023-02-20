package day5.푸드파이트대회

class Solution {
    fun solution(food: IntArray): String {
        return food.mapIndexed{ i, f -> i.toString().repeat(f/2)}
            .joinToString("")
            .let { "${it}0${it.reversed()}" }
    }
}

fun main() {
    val solution = Solution()
    arrayOf(
        intArrayOf(1, 3, 4, 6) to "1223330333221",
        intArrayOf(1, 7, 1, 2) to 	"111303111",
    ).map{ val actual = solution.solution(it.first)
        Triple(it.first.joinToString(":"), it.second, actual) to if (it.second == actual) "O" else "X"}
        .forEach(::println)
}