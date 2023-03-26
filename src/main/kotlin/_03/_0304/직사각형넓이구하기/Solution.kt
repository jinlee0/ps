package _0304.직사각형넓이구하기

class Solution {
//    fun solution(dots: Array<IntArray>): Int {
//        var xMax = -256
//        var xMin = 256
//        var yMax = -256
//        var yMin = 256
//
//        for(dot in dots){
//            if(dot.first() > xMax) xMax = dot.first()
//            else if(dot.first() < xMin) xMin = dot.first()
//            if(dot.last() > yMax) yMax = dot.last()
//            else if(dot.last() < yMin) yMin = dot.last()
//        }
//
//        return (xMax - xMin) * (yMax - yMin)
//    }

    fun solution(dots: Array<IntArray>) =
        (dots.maxOf { it.first() } - dots.minOf { it.first() }) * (dots.maxOf { it.last() } - dots.minOf { it.last() })
}