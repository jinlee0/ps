package day7.숫자까꿍

import kotlin.math.min

class Solution {
    fun solution(X: String, Y: String): String = X.toSet().let { xSet ->
        var answer = ""
        xSet.sortedDescending().forEach{e ->
            val xCount = X.count { it == e }
            if(xCount > 0) {
                val yCount = Y.count { it == e }
                answer += e.toString().repeat(min(xCount, yCount))
            }
        }
        return if (answer.isEmpty()) "-1"
        else if(answer.trim('0').isEmpty()) "0"
        else answer
    }
}

fun main() {
    arrayOf(
        "100" to "2345" to "-1",
        "100" to "203045" to "0",
        "100" to "123450" to "10",
    ).map { it.second to Solution().solution(it.first.first, it.first.second) }
        .forEach(::println)

    println("100".filter { it!='0' })
}