package _0305.겹치는선분의길이

class Solution {
//    fun solution(lines: Array<IntArray>): Int {
//        val min = lines.minOf { it[0] }
//        val max = lines.maxOf { it[1] }
//        return (min until max).sumOf { i ->
//            lines
//                .count { it[0] <= i && it[1] > i }
//                .let { if (it > 1) 1 else 0 }.toInt()
//        }
//    }

    fun solution(lines: Array<IntArray>): Int {
        val shortArray = ShortArray(200)
        lines.forEach { line ->
            (line.first() until line.last()).forEach { shortArray[it + 100]++ }
        }
        return shortArray.sumOf { (if(it>1) 1 else 0).toInt() }
    }
}