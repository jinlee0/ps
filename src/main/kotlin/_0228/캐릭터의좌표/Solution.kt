package _0228.캐릭터의좌표

class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): MutableList<Int> {
        val xMax = board[0] / 2
        val yMax = board[1] / 2
        return keyinput.fold(mutableListOf(0, 0)) { lastPoint, input ->
            getNewLocation(lastPoint, movingOperation[input]!!, xMax, yMax)
        }
    }

    private fun getNewLocation(lastPoint: MutableList<Int>, move: Pair<Int, Int>, xMax: Int, yMax: Int): MutableList<Int> {
        val x = getNewElement(lastPoint[0], move.first, xMax)
        val y = getNewElement(lastPoint[1], move.second, yMax)
        return lastPoint.apply { this[0] = x; this[1] = y }
    }

    private fun getNewElement(lastElement: Int, move: Int, max: Int) : Int {
        return if(move == 0)  lastElement
        else (lastElement + move).coerceIn(-max  .. max)
    }

    companion object {
        val movingOperation = mapOf(
            "left" to (-1 to 0),
            "right" to (1 to 0),
            "up" to (0 to 1),
            "down" to (0 to -1)
        )
    }
}