package _0305.유한소수판별하기

class Solution {
    fun solution(a: Int, b: Int): Int {
        val gcd = gcd(a, b)
        var divider = b / gcd
        while (divider % 2 == 0) divider /= 2
        while(divider%5 == 0) divider /= 5
        return if(divider > 1) 2
        else 1
    }

    private tailrec fun gcd(a: Int, b: Int): Int {
        return if (b==0) a else gcd(b, a%b)
    }

}

fun main() {
    val solution = Solution()

    (1..10).forEach { i ->
        (10..15).forEach { j ->
            println("$i $j ${solution.solution(i, j)}")
        }
    }
}