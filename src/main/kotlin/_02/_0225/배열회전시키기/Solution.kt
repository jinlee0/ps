package _0225.배열회전시키기

import java.util.Collections

class Solution {
    fun solution(numbers: IntArray, direction: String) = when (direction) {
        "right" -> 1
        "left" -> -1
        else -> throw IllegalArgumentException()
    }.let {numbers.rotated(it)}
}

fun IntArray.rotated(distance: Int): List<Int> {
    val list = this.toList()
    Collections.rotate(list, distance)
    return list
}