package _0306.치킨쿠폰

class Solution {
//    fun solution(chicken: Int): Int {
//        var sum = 0
//        var curr = chicken
//        while(curr >= 10) {
//            val coupon = curr / 10
//            curr -= coupon * 9
//            sum += coupon
//        }
//        return sum
//    }
    fun solution(chicken: Int): Int {
        return rec(chicken, 0)
    }

    // 꼬리 재귀 구현
    tailrec fun rec(chicken: Int, a: Int): Int {
        if (chicken < 10)
            return a
        return rec(chicken / 10 + chicken % 10, chicken / 10 + a)
    }
}