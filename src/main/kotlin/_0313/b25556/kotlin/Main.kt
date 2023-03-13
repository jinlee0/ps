package _0313.b25556.kotlin

fun main() {
    val br = System.`in`.bufferedReader()
    br.readLine()
    val list = br.readLine().split(" ").map(String::toInt)
    val tops = IntArray(4)

    var result = "YES"
    first@for (i in list) {
        for (j in tops.indices) {
            if(i > tops[j]) {
                tops[j] = i;
                continue@first
            }
        }
        result = "NO"
        break;
    }
    println(result)
}