package _0223.구슬을나누는경우의수

import kotlin.math.min

class Solution {
    fun solution(balls: Int, share: Int) =
        (1..min(share, (balls - share)))
            .fold(1.0) {acc, i -> acc * (balls - i + 1) / i }
}