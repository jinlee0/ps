package _0306.옹알이

//class Solution {
//    fun solution(babbling: Array<String>) = babbling
//        .map { babble ->
//            var replaced = babble
//            babblesCan.forEach { replaced = replaced.replaceFirst(it, " ") }
//            replaced.trim().length
//        }
//        .count { it < 1 }
//
//    companion object {
//        val babblesCan = arrayOf(
//            "aya", "ye", "woo", "ma"
//        )
//    }
//}

// 정규표현식 사용. 이게 더 빠르다.
class Solution {
    fun solution(babbling: Array<String>) = "aya|ye|woo|ma".toRegex().let { regex ->
        babbling.map { it.replace(regex, "") }
            .count { it.isEmpty() }
    }
}