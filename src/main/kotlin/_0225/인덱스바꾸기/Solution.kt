package _0225.인덱스바꾸기


class Solution {
    fun solution(my_string: String, num1: Int, num2: Int) = my_string.swapped(num1, num2)
}

private fun String.swapped(index1: Int, index2: Int): String {
    return this.toCharArray().let {arr ->
        val temp = arr[index1]
        arr[index1] = arr[index2]
        arr[index2] = temp
        arr.fold(StringBuilder()){sb, c -> sb.append(c) }.toString()
    }
}

//private fun CharArray.foldToString(operation: (c: Any) -> Any): String {
//    val accumulator = StringBuilder()
//    for(element in this) accumulator.append(operation(element))
//    return accumulator.toString()
//}
//
//private fun CharArray.foldToString(): String {
//    return this.foldToString { it }
//}