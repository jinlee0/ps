package _0223.x만큼간격이있는n개의숫자

class Solution {
    fun solution(x: Int, n: Int) = LongArray(n){i: Int -> (i.toLong() + 1) * x }
}