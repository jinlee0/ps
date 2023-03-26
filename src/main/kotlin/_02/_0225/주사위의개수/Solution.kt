package _0225.주사위의개수

class Solution {
    fun solution(box: IntArray, n: Int) = box.map { it/n }.multiply()
}

private fun List<Int>.multiply(): Int {
    return this.fold(1){acc, e -> acc * e }
}
