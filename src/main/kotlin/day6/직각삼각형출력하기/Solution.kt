package day6.직각삼각형출력하기

class Solution {
}

fun main(args: Array<String>) {
    val n = readln().split(' ').map(String::toInt).first()
    (1..n).joinToString("\n") { "*".repeat(it) }.let(::println)
}