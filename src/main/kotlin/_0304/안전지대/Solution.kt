package _0304.안전지대

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(board: Array<IntArray>) =
        board.foldIndexed(0) { r, acc, row ->
            row.foldIndexed(acc){c, acc, _ ->
                if(unsafe(board, r, c))
                    acc
                else
                    acc + 1
            }
        }

    private fun unsafe(board: Array<IntArray>, targetRow: Int, targetCol: Int): Boolean {
        (max(0, targetRow-1)..min(board.size - 1, targetRow+1))
            .forEach { currRow ->
                (max(0, targetCol-1)..min(board.size - 1, targetCol + 1))
                    .forEach { currCol ->
                        val b = board[currRow][currCol] == 1
                        if(b) return true;
                    }
            }
        return false;
    }
}

fun main() {
    val solution = Solution()

    arrayOf(
        arrayOf(
            intArrayOf(0,0,0,0,0),
            intArrayOf(0,0,0,0,0),
            intArrayOf(0,0,0,0,0),
            intArrayOf(0,0,1,0,0),
            intArrayOf(0,0,0,0,0),
        )
    ).map { solution.solution(it) }
        .forEach(::println)
}