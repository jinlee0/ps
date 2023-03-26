package _0315.나누어떨어지는숫자배열

fun main() {
    arrayOf(
        intArrayOf(5, 9, 7, 10) to 5,
        intArrayOf(2, 36, 1, 3) to 1,
        intArrayOf(3,2,6) to 10,
    ).map { Solution().solution(it.first, it.second).toList() }
        .forEach(::println)
}