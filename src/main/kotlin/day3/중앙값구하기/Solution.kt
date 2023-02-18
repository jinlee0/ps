package day3.중앙값구하기

class Solution {
    fun solution(array: IntArray) = array.sortedArray()[array.size / 2]
}

fun main() {
    val solution = Solution()
    arrayOf(
        intArrayOf(1, 2, 7, 10, 11),
        intArrayOf(9, -1, 0)
    ).map (solution::solution).forEach ( ::println )
}