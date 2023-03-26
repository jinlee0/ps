package _0222.외계행성의나이

class Solution {
    fun solution(age: Int) = age.toString().map { (Character.getNumericValue(it) + 'a'.code).toChar() }.joinToString("")
}