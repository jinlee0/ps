package day6.짝수홀수개수

class Solution {
    fun solution(num_list: IntArray) = num_list.filter { it%2==0 }.let { intArrayOf(it.size, num_list.size - it.size) }
}

fun main() {

}