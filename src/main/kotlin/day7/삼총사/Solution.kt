package day7.삼총사

class Solution{
    fun solution(number: IntArray): Int {
        var sum: Int = 0
        (0..number.size - 3).forEach { i ->
            (i + 1..number.size - 2).forEach { j ->
                (j + 1..number.size - 1).forEach { k ->
                    if (number[i] + number[j] + number[k] == 0) sum++
                }
            }
        }
        return sum;
    }
}

fun main() {
    val solution = Solution()
    arrayOf(
        intArrayOf(-2, 3, 0, 2, -5) to 2,
        intArrayOf(-3, -2, -1, 0, 1, 2, 3) to 5,
        intArrayOf(-1, 1, -1, 1) to 0,
    ).map { it.second to solution.solution(it.first) }
        .forEach(::println)
}