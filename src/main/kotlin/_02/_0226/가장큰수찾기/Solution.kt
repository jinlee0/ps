package _0226.가장큰수찾기

class Solution {
    fun solution(array: IntArray) = with(array) {
        var max = 0
        var maxIndex = 0
        forEachIndexed { index, i ->
            if(i > max) {
                max = i
                maxIndex = index
            }
        }
        intArrayOf(max, maxIndex)
    }

    // 간편하긴 하지만 중복 탐색이 일어난다.
    // v1.6 전이라면 IntArray.max()가 Deprecated라 채점기에서 인식을 못할수도. maxOrNull()을 써야 한다.
    // v1.6 이후로는 max() 내부에서 maxOrNull()을 호출한다.
    fun solution2(array: IntArray) = with(array.max()){
        intArrayOf(this, array.indexOf(this))
    }
}

fun main() {
    arrayOf(
        intArrayOf(1, 8, 3),
        intArrayOf(9, 10, 11, 8),
    ).map { Solution().solution2(it).toList() }
        .forEach(::println)
}