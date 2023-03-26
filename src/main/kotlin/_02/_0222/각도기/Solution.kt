package _0222.각도기

class Solution {
    fun solution(angle: Int) =  when {
        angle < 90 -> 1
        angle == 90 -> 2
        angle < 180 -> 3
        angle == 180 -> 4
        else -> {throw IllegalArgumentException()}
    }
}