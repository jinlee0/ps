package _0228.OX퀴즈

class Solution {
    fun solution(quiz: Array<String>) = quiz.map { s -> valid(s) }

    private fun valid(s: String) : String {
        val split = s.split(' ')
        val X = split[0].toInt()
        val Y = if(split[1] == "+") split[2].toInt() else split[2].toInt() * -1
        val result = split.last().toInt()
        return if(X + Y == result) "O" else "X"
    }
}