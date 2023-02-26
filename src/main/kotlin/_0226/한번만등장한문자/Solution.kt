package _0226.한번만등장한문자

class Solution {
    fun solution(s: String) = s.groupBy { it }
        .filter { it.value.count()==1 }
        .flatMap { it.value }
        .sorted()
        .fold(StringBuilder()){sb, c -> sb.append(c)}.toString()
}


fun main() {
    Solution().solution("hello")
}