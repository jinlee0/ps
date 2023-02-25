package _0225.합성수찾기

import kotlin.math.sqrt

class Solution {
    fun solution(n: Int) = (4..n).count{!it.isPrime()}
}

private fun Int.isPrime(): Boolean {
    return !(2..sqrt(this.toDouble()).toInt()).any { this % it ==0 }
}

//fun main() {
//    val solution = Solution()
//    arrayOf(1, 2, 3, 4, 6, 8, 9, 10, 12, 14, 15, 2147483647).map { it to it.isPrime() }.forEach(::println)
//}