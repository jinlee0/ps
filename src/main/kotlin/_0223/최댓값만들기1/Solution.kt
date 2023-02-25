package _0223.최댓값만들기1

class Solution {
    fun solution(numbers: IntArray) = numbers.sortedArray()
        .let { it[it.size - 1] * it[it.size - 2] }
}
