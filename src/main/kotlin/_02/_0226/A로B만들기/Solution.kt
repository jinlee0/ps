package _0226.A로B만들기

class Solution {
    fun solution(before: String, after: String): Int {
        return before.toMutableList().let { list ->
            var same = 1
            after.forEach { c ->
                val indexOfC = list.indexOf(c)
                if (indexOfC == -1) {
                    same = 0
                    return@forEach
                } else {
                    list.removeAt(indexOfC)
                }
            }
            same
        }
    }
}