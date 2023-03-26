package _0223.약수의개수덧셈

import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int) = (left..right)
        .fold(0){acc, i ->
            if (sqrt(i.toDouble()) % 1 == 0.0) acc - i else acc + i
        }
}

//fun main() {
//    Solution().solution(13, 17)
//    println(1.0 % 1)
//}