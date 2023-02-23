package _0223.가위바위보

class Solution {
    private val winningPlan = mapOf(
        '2' to '0',
        '0' to '5',
        '5' to '2',
    )
    fun solution(rsp: String) = rsp.map{ winningPlan[it] }.joinToString("")
}

