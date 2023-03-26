package _0225.점의위치구하기

class Solution {
    fun solution(dot: IntArray) =
        if(dot.first() > 0) {
            if(dot.last()>0) 1
            else 4
        } else {
            if(dot.last()>0) 2
            else 3
        }
}