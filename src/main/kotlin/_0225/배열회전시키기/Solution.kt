package _0225.배열회전시키기

import java.util.Collections

class Solution {
    fun solution(numbers: IntArray, direction: String) = when (direction) {
        "right" -> 1
        "left" -> -1
        else -> throw IllegalArgumentException()
    }.let {
        val list = numbers.toList()
        Collections.rotate(list, it)
        list
    }
}

//fun main() {
//    val numbers = intArrayOf(1, 2, 3).toList()
//    Collections.rotate(numbers, 1)
//    println(numbers)
//    Collections.rotate(numbers, -1)
//    println(numbers)
//
//}