package _0222.나머지가1이되는수찾기

class Solution {
    fun solution(n: Int) = (1..n).first{ n % it == 1}
}