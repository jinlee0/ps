package _0226.k의개수

class Solution {
//    fun solution(i: Int, j: Int, k: Int) = (1..13).sumOf { it.toString().count { c -> c == j.digitToChar() } }
    fun solution(i: Int, j: Int, k: Int) = k.digitToChar().let {kChar ->
        (i..j).fold(StringBuilder()) { sb, i -> sb.append(i) }.count { it == kChar}
    }.toString()
}
