import java.util.StringTokenizer

class Main {

}

fun main() {
    val br = System.`in`.bufferedReader()
    for (i in 0..9) {
        val st = StringTokenizer(br.readLine())
        println("{\"${st.nextToken()}\", \"${st.nextToken()}\"},")
    }
}