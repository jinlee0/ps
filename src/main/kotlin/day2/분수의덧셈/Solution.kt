package day2.분수의덧셈

import kotlin.math.min

class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var dividend = numer1 * denom2 + numer2 * denom1
        var divider = denom1 * denom2
        for (i in 2..min(dividend, divider)/2) {
            while(dividend % i == 0 && divider % i == 0) {
                dividend /= i
                divider /= i
            }
        }
        return intArrayOf(dividend, divider)
    }
}

fun main() {
    arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(9, 2, 1, 3),
        arrayOf(2, 8, 2, 8),
    ).map { Solution().solution(it[0], it[1], it[2], it[3]) }.forEach(::print)
}
fun print(s: IntArray) = println(s.joinToString(","))