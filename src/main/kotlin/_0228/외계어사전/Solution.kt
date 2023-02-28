package _0228.외계어사전

class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        first@ for (word in dic) {
            for (c in spell) {
                if(!word.contains(c)) continue@first
            }
            if(word.length == spell.size) return 1
        }
        return 2
    }
}