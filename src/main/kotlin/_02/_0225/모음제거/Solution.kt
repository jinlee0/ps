package _0225.모음제거

import kotlin.math.sqrt

class Solution {
    fun solution(my_string: String) = my_string.filterNot (letters::contains)

    companion object {
        val letters = arrayOf('a', 'e', 'i', 'o', 'u')
    }
}
