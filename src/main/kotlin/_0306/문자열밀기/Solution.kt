package _0306.문자열밀기

class Solution {
    fun solution(A: String, B: String) = A.indices
        .find{A.substring(A.length - it, A.length) + A.substring(0, A.length - it) == B} ?: -1
}

// WOW..
//class Solution {
//    fun solution(A: String, B: String): Int = (B + B).indexOf(A)
//}