package _0223.모스부호1

class Solution {
    val morseMap = mapOf(
        ".-" to "a","-..." to "b","-.-." to "c","-.." to "d","." to "e","..-." to "f",
        "--." to "g","...." to "h",".." to "i",".---" to "j","-.-" to "k",".-.." to "l",
        "--" to "m","-." to "n","---" to "o",".--." to "p","--.-" to "q",".-." to "r",
        "..." to "s","-" to "t","..-" to "u","...-" to "v",".--" to "w","-..-" to "x",
        "-.--" to "y","--.." to "z"
    )
    fun solution(letter: String) = letter.split(' ').joinToString("") { morseMap[it]!! }
}
//
//fun main() {
//    val trimIndent = """
//            '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//            '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//            '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//            '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//            '-.--':'y','--..':'z'
//    """.trimIndent().replace(":", " to ").replace('\'', '"')
//    println(trimIndent)
//}