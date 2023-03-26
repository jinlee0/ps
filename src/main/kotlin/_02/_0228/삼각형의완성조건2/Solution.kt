package _0228.삼각형의완성조건2

import kotlin.math.min

class Solution {
//    fun solution(sides: IntArray) = sides.minOrNull()!! * 2 - 1

    // 이게 훨 빠르다.
    fun solution(sides: IntArray) = min(sides[0], sides[1]) * 2 - 1
}