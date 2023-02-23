package _0223.구슬을나누는경우의수

import kotlin.math.min

class Solution {
    fun solution(balls: Int, share: Int) =
        (1..min(share, (balls - share)))
            .map { it to balls - it + 1 }
            .fold(1.0) {acc, pair -> acc * pair.second / pair.first }

}