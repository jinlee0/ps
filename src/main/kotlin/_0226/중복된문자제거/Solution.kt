package _0226.중복된문자제거

class Solution {
    fun solution(my_string: String) = my_string.toSet().fold(StringBuilder()){sb, c -> sb.append(c)}.toString()
}