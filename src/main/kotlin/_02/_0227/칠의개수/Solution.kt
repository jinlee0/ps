package _0227.칠의개수

class Solution {
    // 이것도 꽤 빠름
//    fun solution(array: IntArray) =array
//        .fold(0) {acc, i -> acc + i.toString().count{it=='7'}}

    // 제일 빠름
    fun solution(array: IntArray) = array
        .fold(0) {acc, i ->
            var value = i
            var sum = acc
            while (true) {
                if(value % 10 == 7) sum++
                value /= 10
                if(value == 0) break
            }
            sum
        }
}
