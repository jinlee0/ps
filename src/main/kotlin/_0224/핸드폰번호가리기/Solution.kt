package _0224.핸드폰번호가리기

class Solution {
    fun solution(phone_number: String) =
        "".padStart(phone_number.length - 4, '*') +
                phone_number.takeLast(4)
}