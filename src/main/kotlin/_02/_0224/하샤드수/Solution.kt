package _0224.하샤드수

class Solution {
    fun solution(x: Int) = x.toString().sumOf { Character.getNumericValue(it) }.let { x%it==0 }
}