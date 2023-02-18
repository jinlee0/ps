package day2.bonus2

class Solution {
    fun solution(s: String): IntArray {
        return s.mapIndexed { index, c ->
            s.slice(0 until index).lastIndexOf(c).let {
                if (it<0) -1
                else index -it
            }
        }.toIntArray()
    }
}

fun main() {
    var inputs = arrayOf(
        "banana",
        "foobar"
    )
    val solution = Solution()
    inputs.map(solution::solution).forEach{println(it.toString(true))}
}

fun IntArray.toString(i:Boolean) :String {
    return this.joinToString(",")
}
