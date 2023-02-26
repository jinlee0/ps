package _0226.컨트롤제트

import java.util.Stack


class Solution {
//    fun solution(s: String) = s.split(' ').toMutableList().apply {
//        while (true) {
//            val indexOfZ = indexOf("Z")
//            if(indexOfZ == -1) break
//            val indexToRemove = indexOfZ - 1
//            removeAt(indexToRemove)
//            removeAt(indexToRemove)
//        }
//    }.sumOf { it.toInt() }

    fun solution(s: String) = Stack<Int>().apply {
        s.split(' ').forEach{
            if(it != "Z") {
                push(it.toInt())
            } else {
                pop()
            }
        }
    }.sum()
}

fun main() {
    arrayOf(
        "1 2 Z 3",
        "10 20 30 40",
        "10 Z 20 Z 1",
        "10 Z 20 Z",
        "-1 -2 -3 Z",
    ).map { Solution().solution(it) }
        .forEach(::println)
}