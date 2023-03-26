package _0226.약수구하기

class Solution {
    fun solution(n: Int) = (1..n).filter { n % it == 0 }

    // toMutableList, add의 비용이 있어서 차라리 (1..n)으로 돌리는 게 빠르다.
//    fun solution(n: Int) = (1..n/2).filter{n%it==0}
//        .toMutableList()
//        .apply {add(n)}
}

fun main() {
    (1..30).map { it to Solution().solution(it) }.forEach(::println)
}