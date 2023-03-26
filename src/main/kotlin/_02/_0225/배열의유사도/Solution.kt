package _0225.배열의유사도

class Solution {
    // 이게 더 빠름
    fun solution(s1: Array<String>, s2: Array<String>) = s1.count(s2::contains)

    // Set으로 변환하는 데 비용이 듦
//    fun solution(s1: Array<String>, s2: Array<String>) = s1.intersect(s2.toSet()).count()
}