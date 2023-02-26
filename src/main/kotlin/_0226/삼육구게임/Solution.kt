package _0226.삼육구게임

class Solution {
    fun solution(order: Int) = order.toString().count(tsn::contains)

    companion object {
        val tsn = listOf('3', '6', '9')
    }
}
