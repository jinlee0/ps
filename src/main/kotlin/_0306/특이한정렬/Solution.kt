package _0306.특이한정렬

import kotlin.math.abs

class Solution {
    fun solution(numlist: IntArray, n: Int) =
        numlist.sortedWith{o1, o2 -> compareWeired(n, o1, o2)}
    private fun compareWeired(n: Int, o1: Int, o2: Int) =
        (abs(o1 - n) - abs(o2 - n)).let { if (it == 0) o2 - o1 else it }
}