package _0225.최댓값만들기2

import kotlin.math.max

class Solution {
    fun solution(numbers: IntArray) = numbers.sorted()
        .let { max(it[0]*it[1], it[it.size-1]*it[it.size-2]) }
}