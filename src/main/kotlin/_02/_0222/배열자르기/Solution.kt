package _0222.배열자르기

class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int) = numbers.sliceArray(num1..num2)
}