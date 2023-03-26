package _0225.숨어있는숫자의덧셈1

class Solution {
    fun solution(my_string: String) = my_string.filter(Char::isDigit).sumOf(Char::digitToInt)
}