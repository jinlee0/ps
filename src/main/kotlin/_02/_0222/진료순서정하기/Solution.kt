package _0222.진료순서정하기

class Solution {
    fun solution(emergency: IntArray) = emergency
        .sortedDescending()
        .let { sorted -> emergency.map{sorted.indexOf(it) + 1 } }
}