package _0225.점의위치구하기

class Solution {
    fun solution(dot: IntArray) = when {
        dot.first() > 0 && dot.last() > 0 -> 1
        dot.first() < 0 && dot.last() > 0 -> 2
        dot.first() < 0 && dot.last() < 0 -> 3
        dot.first() > 0 && dot.last() < 0 -> 4
        else -> throw IllegalArgumentException()
    }
}