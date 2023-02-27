package _0227.콜라츠추측

class Solution {
    fun solution(num: Int) = collatz(num.toLong(), 0)

    private tailrec fun collatz(num: Long, count: Int): Int {
        if(num==1L)
            return count
        if(count == 500)
            return -1
        return if (num % 2 == 0L)
            collatz(num shr 1, count + 1)
        else
            collatz(num * 3 + 1, count + 1)
    }
}

fun main() {
    arrayOf(
        1 to 0,
        6 to 8,
        16 to 4,
        626331 to -1,
    ).map { it.second to Solution().solution(it.first) }
        .forEach(::println)
}