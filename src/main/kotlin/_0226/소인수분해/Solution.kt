package _0226.소인수분해

class Solution {
    fun solution(n: Int) = n.factorizationList()
}

private fun Int.factorizationList(): List<Int> {
    return mutableListOf<Int>()
        .also { initial ->
            var curr = this
            (2..this/2).fold(initial) { list, i ->
                list.also {
                    if (curr % i == 0) {
                        list += i
                        while (curr % i == 0) curr /= i
                    }
                }
            }
        }.ifEmpty { listOf(this) }
}

fun main() {
    (2..100)
        .map { it to Solution().solution(it) }
        .forEach(::println)
}