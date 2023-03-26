package _0222.짝수의합

class Solution {
    fun solution(n: Int) = (2..n step 2).fold(0){acc, i -> acc + i }
}