package _0227.문자열계산하기

class Solution {
    fun solution(my_string: String) = my_string
        .replace("+ ", "")
        .replace("- ", "-")
        .split(' ')
        .sumOf { it.toInt() }
}

fun main() {
    arrayOf(
        "3 + 4" to 7,
        "1 + 2 + 3" to 6,
        "3 - 2 - 1" to 0,
    ).map { it.second to Solution().solution(it.first) }
        .forEach(::println)
    val toInt = "+3".toInt()
    println("$toInt")
}