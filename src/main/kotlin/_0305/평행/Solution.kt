package _0305.평행

class Solution {
    // dots의 길이와 상관 없이 가능.
    // 조건에 따라 길이 고정하면 코드도 짧아지고 성능도 더 올라간다.
    fun solution(dots: Array<IntArray>): Int {
        var left = 0
        var right = 1
        while(true) {
            val dot1 = dots[left]
            val dot2 = dots[right]
            dots.swap(0, left)
            dots.swap(1, right)
            // loop
            var _left = 2
            var _right = 3
            while(true) {
                val dot3 = dots[_left]
                val dot4 = dots[_right]
                if(slopeOf(dot1, dot2) == slopeOf(dot3, dot4)) return 1
                if(_right<dots.size-1) {
                    _right++
                } else if (_left<dots.size-2) {
                    _left++
                    _right = _left + 1
                } else {
                    break
                }
            }
            dots.swap(0, left)
            dots.swap(1, right)
            if(right<dots.size-1) {
                right++
            } else if (left < dots.size - 2) {
                left++
                right = left + 1
            } else {
                break
            }
        }
        return 0
    }

    private fun slopeOf(dot1: IntArray, dot2: IntArray): Double {
        return (dot2[1] - dot1[1]).toDouble()/(dot2[0]-dot1[0])
    }

}

private fun <T> Array<T>.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}
