package _0225.이차원으로만들기

import java.util.stream.IntStream
import java.util.stream.Stream

class Solution {
    fun solution(num_list: IntArray, n: Int) = (0 until num_list.size/n)
        .map { val i = it * n
            num_list.sliceArray(i until i + n) }
    fun solution2(num_list: IntArray, n: Int) = num_list.toList().chunked(n)
}


