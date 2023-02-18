package day2.bonus1

class Solution {
    fun solution(t: String, p: String): Int {
        return (0..t.length - p.length)
            .map { t.substring(it until it + p.length) }
            .count { it <= p }
    }
}

fun main() {
    val inputs = arrayOf(
        arrayOf("3141592", "271"),
        arrayOf("500220839878", "7"),
        arrayOf("10203", "15"),
        arrayOf("1221351118575141528544", "12511")
    )
    inputs.map { Solution().solution(it[0], it[1]) }.forEach(::println)
}
