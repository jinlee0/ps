package _0226.가까운수

import kotlin.math.abs

class Solution {
    // 정렬 먼저 하면 다시 abs가 같아도 값 대소에 따라 정렬된다.
    fun solution(array: IntArray, n: Int): Int = array
        .sortedArray()
        .minByOrNull { abs(it-n) }!!
}

fun main() {
    arrayOf(
//        intArrayOf(1) to 20,
        intArrayOf(3, 1) to 1
    ).map { Solution().solution(it.first, it.second) }
        .forEach(::println)

    println(intArrayOf(1, 1).sorted())
}