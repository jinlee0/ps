package _0306.등수매기기

class Solution {
    fun solution(score: Array<IntArray>) = score
        .map(IntArray::average).let { mapped ->
            val sortedDescending = mapped.sortedDescending()
            mapped.map { sortedDescending.indexOf(it) + 1 }
        }
}