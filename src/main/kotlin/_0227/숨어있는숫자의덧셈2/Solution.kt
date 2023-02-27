package _0227.숨어있는숫자의덧셈2

class Solution {
    fun solution(my_string: String) = my_string
        .chunkedOnlyDigit()
        .sumOf(String::toInt)
}

private fun String.chunkedOnlyDigit(): List<String> {
    val list = mutableListOf<String>()
    var left = 0
    var right = 0
    while (left < this.length) {
        if (this[left].isDigit()) {
            right = left
            while(right < this.length && this[right].isDigit()) {
                right++
            }
            list += this.substring(left, right)
            left = right
        }
        left++
    }
    return list
}

fun main() {
    val solution = Solution().solution("aAb1B2cC34oOp")
    println(solution)
}