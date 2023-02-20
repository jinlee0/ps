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

/**
 * chatGPT 의 방법
 * class Solution {
 *     fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): Pair<Int, Int> {
 *         val numerator = numer1 * denom2 + numer2 * denom1
 *         val denominator = denom1 * denom2
 *         return simplifyFraction(numerator, denominator)
 *     }
 *
 *     fun simplifyFraction(numerator: Int, denominator: Int): Pair<Int, Int> {
 *         val gcd = numerator.gcd(denominator)
 *         val simplifiedNumerator = numerator / gcd
 *         val simplifiedDenominator = denominator / gcd
 *         return Pair(simplifiedNumerator, simplifiedDenominator)
 *     }
 *
 *     fun Int.gcd(other: Int): Int = if (other == 0) this else other.gcd(this % other)
 * }
 */

fun main() {
    arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(9, 2, 1, 3),
        arrayOf(2, 8, 2, 8),
    ).map { Solution().solution(it[0], it[1], it[2], it[3]) }.forEach(::print)
}
fun print(s: IntArray) = println(s.joinToString(","))