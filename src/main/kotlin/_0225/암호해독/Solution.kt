package _0225.암호해독

class Solution {
    // windowed가 여러 리스트를 생성하고 joinToString가 리스트를 생성하는 데 비용이 듦
    /*fun solution(cipher: String, code: Int) =
        cipher.substring(code - 1).windowed(size = 1, step = code).joinToString("")*/

    // 이게 훨 빠름.
    fun solution(cipher: String, code: Int) =
        cipher.filterIndexed { index, _ -> index.inc() % code == 0 }
}