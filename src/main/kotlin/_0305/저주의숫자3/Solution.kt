package _0305.저주의숫자3

class Solution {
    fun solution(n: Int) = generateSequence(1) {it + 1}
        .filterNot(Int::isCursed)
        .elementAt(n-1)
}

private fun Int.isCursed(): Boolean {
    if(this % 3 == 0) return true
    var curr = this
    while(curr != 0) {
        if(curr % 10 == 3)
            return true
        curr /= 10
    }
    return false
}

fun main() {
    val solution = Solution()

    solution.solution(15).let(::println)
    solution.solution(40).let(::println)
}