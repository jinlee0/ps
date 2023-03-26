package _0306.로그인성공

class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        val auth = db.firstOrNull { it[0] == id_pw[0] } ?: return "fail"
        return if (id_pw[1] == auth[1]) "login" else "wrong pw"
    }
}