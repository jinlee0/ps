package _0225.대문자와소문자

class Solution {
    // 주어진 테스트케이스에서는 둘이 비슷함.
//    fun solution(my_string: String) = my_string.map{it.reverseCase()}.joinToString("")

//    fun solution(my_string: String) = my_string.fold("") {acc, c -> acc + c.reverseCase()}

    // 캬 지렸다. 훨씬 빠르다.
    fun solution(my_string: String) = my_string.fold(StringBuilder()) {acc, c -> acc.append(c.reverseCase())}.toString()
}

private fun Char.reverseCase(): Char {
    return if(this.isUpperCase()) this.lowercaseChar() else this.uppercaseChar()
}