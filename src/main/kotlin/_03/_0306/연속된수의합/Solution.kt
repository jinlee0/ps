package _0306.연속된수의합

class Solution {
    fun solution(num: Int, total: Int) =
        (total / num + (1-num)/2).let { k ->
            IntArray(num){it + k}
        }
}

