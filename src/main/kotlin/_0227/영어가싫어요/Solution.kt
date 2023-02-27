package _0227.영어가싫어요

class Solution {
    fun solution(numbers: String) = numberNameMap.entries
        .fold(numbers){acc, entry -> acc.replace(entry.key, entry.value)}
        .toLong()

    companion object {
        val numberNameMap = mapOf(
            "zero" to "0",
            "one" to "1",
            "two" to "2",
            "three" to "3",
            "four" to "4",
            "five" to "5",
            "six" to "6",
            "seven" to "7",
            "eight" to "8",
            "nine" to "9",
        )
    }
}

fun main() {
    Solution().solution("onetwothreefourfivesixseveneightnine")
}