package _03._0327.배열회전시키기;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        return direction.equals("right") ? rotateRight(numbers) : rotateLeft(numbers);
    }

    private int[] rotateRight(int[] arr) {
        for(int i = arr.length-1; i > 0; i--) {
            swap(arr, i, i-1);
        }
        return arr;
    }

    private int[] rotateLeft(int[] arr) {
        for(int i = 0; i < arr.length -1; i++) {
            swap(arr, i, i+1);
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
