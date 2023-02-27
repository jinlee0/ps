package _0227.이진수더하기

class Solution {
    fun solution(bin1: String, bin2: String) =
        Integer.toBinaryString(bin1.toInt(2) + bin2.toInt(2))
}

fun main() {
    println(Solution().solution("10", "11"))

}