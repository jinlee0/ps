package _0304.다항식더하기

class Solution {
    fun solution(polynomial: String): String = if(polynomial.isEmpty()) "" else polynomial
        .splitToSequence(' ')
        .filterNot { it == "+" }
        .groupBy { it.last() == 'x' }
        .map {entry ->
            if(entry.key) {
                val coefficient = entry.value.sumOf { removeXFrom(it) }
                if(coefficient == 1)
                    "x"
                else
                    "" + coefficient + "x"
            }
            else "" + entry.value.sumOf(String::toInt)
        }
        .filterNot { it == "0" || it == "0x" }
        .sortedWith { o1, o2 -> o2.last() - o1.last() }
        .joinToString(" + ")

    private fun removeXFrom(x: String) : Int {
        return if (x.length == 1) 1
        else x.substring(0, x.length-1).toInt()
    }
}

fun main() {
    Solution().solution("3x + 7 + x").let(::println)
    Solution().solution("3").let(::println)
    Solution().solution("").let(::println)
    Solution().solution("0").let(::println)
    Solution().solution("0 + 2x + 0").let(::println)
    Solution().solution("1 + x").let(::println)
}