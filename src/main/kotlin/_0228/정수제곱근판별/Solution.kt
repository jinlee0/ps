package _0228.정수제곱근판별

import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Double {
        val sqrt = sqrt(n.toDouble())
        return if(sqrt % 1 == 0.0)
            (sqrt + 1) * (sqrt + 1)
        else
            -1.0
    }
}