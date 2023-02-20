package day5.옷가게할인받기

class Solution {
    fun solution(price: Int) = when {
        price >= 500_000 -> price * 0.8
        price >= 300_000 -> price * 0.9
        price >= 100_000 -> price * 0.95
        else -> price
    }.toInt()
}

fun main() {
    val solution = Solution()
    arrayOf(
        150_000 to 142_500,
        580_000 to 464_000,
    ).map { val actual = solution.solution(it.first)
        Triple(it.first, it.second, actual) to if(it.second==actual.toInt()) "O" else "X"
    }.forEach(::println)
}