package _0227.잘라서배열로저장하기

import kotlin.math.ceil
import kotlin.math.min

class Solution {
//    fun solution(my_str: String, n: Int) = my_str.windowed(n, n, true)

    // 이게 빠르다.
    fun solution(my_str: String, n: Int) =
        List(ceil(my_str.length.toDouble()/n).toInt()) { i ->
            val end = min(n * (i + 1), my_str.length)
            my_str.substring(i*n, end)
        }
}