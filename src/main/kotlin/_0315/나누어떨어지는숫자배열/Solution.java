package _0315.나누어떨어지는숫자배열;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        // Array만 사용한다면
        int curr = 0;
        int last = arr.length;
        while(true) {
            if(curr == last || curr > arr.length) break;
            if (arr[curr] % divisor == 0) {
                curr++;
                continue;
            }
            int start = curr;
            int end = start + 1;
            while (end < last && arr[end] % divisor != 0) {
                end++;
            }
            moveLeft(arr, start, end, last);
            last -= end - start;
        }
        if(last < 1) return new int[]{-1};
        int[] result = new int[last];
        System.arraycopy(arr, 0, result, 0, last);
        Arrays.sort(result);
        return result;
    }

//    public int[] solution(int[] arr, int divisor) {
//        int[] result = Arrays.stream(arr)
//                .filter(i -> i%divisor == 0)
//                .sorted()
//                .toArray();
//        return result.length == 0 ? new int[]{-1} : result;
//    }

    public void moveLeft(int[] arr, int start, int end, int last) {
        for(;end < last;) {
            arr[start++] = arr[end++];
        }
    }

}
