package day3.최빈값구하기

class Solution {
    fun solution(array: IntArray) =
        array.groupBy { it }
            .entries
            .sortedByDescending { it.value.size }
            .let{
                if (it.size > 1 && it.first().value.size == it[1].value.size) -1
                else it.first().key
    }
}

fun main() {
    val solution = Solution()
    arrayOf(
        arrayOf(intArrayOf(1, 2, 3, 3, 3, 4), intArrayOf(3)),
        arrayOf(intArrayOf(1, 1, 2, 2), intArrayOf(-1)),
        arrayOf(intArrayOf(1, 1, 2, 2, 3, 3), intArrayOf(-1)),
        arrayOf(intArrayOf(1, 1, 1, 2, 2, 3, 3), intArrayOf(1)),

        arrayOf(intArrayOf(1), intArrayOf(1)),
    ).map { input -> Pair(solution.solution(input[0]), input[1].joinToString { it.toString() }) }.forEach(::println)
}

