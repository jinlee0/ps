package _0222.특정문자제거하기

class Solution {
    fun solution(my_string: String, letter: String) = my_string.filterNot { it == letter.first() }
}

fun main() {
    arrayOf(
        "abcdef" to "f" to "abcde",
        "BCBdbe" to "B" to "Cdbe",
    ).map { it.second to Solution().solution(it.first.first, it.first.second) }
        .forEach(::println)
}