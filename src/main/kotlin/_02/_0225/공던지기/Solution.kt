package _0225.공던지기

class Solution {
    fun solution(numbers: IntArray, k: Int) = ((k - 1) * 2) % (numbers.size) + 1
}

/**
 * k 번째 공 던지는 사람
 * 1, 3, 5, 7, 9 ...
 * 1 + (2 * (k- 1)) = 2*k - 1
 *
 */