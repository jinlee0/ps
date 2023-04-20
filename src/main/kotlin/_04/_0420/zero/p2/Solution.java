package _04._0420.zero.p2;
import java.util.*;
class Solution {
    public int[] solution(int[] a, int[] b) {
        int idx = 0;
        int maxIdx = Math.max(a.length, b.length) - 1;

        Deque<Integer> list = new LinkedList<>();

        int acc = 0;
        while(idx <= maxIdx) {
            int sum = acc;
            sum += get(a, idx);
            sum += get(b, idx);
            if(sum > 9) {
                sum -= 10;
                acc = 1;
            } else {
                acc = 0;
            }
            list.addFirst(sum);
            idx++;
        }

        if(acc > 0) list.addFirst(1);

        int[] result = new int[list.size()];
        Iterator<Integer> iterator = list.iterator();
        for(int i = 0; i < result.length; i++)
            result[i] = iterator.next();
        return result;
    }

    private int get(int[] arr, int idx) {
        if(idx < arr.length) {
            return arr[arr.length - 1 - idx];
        } else {
            return 0;
        }
    }
}
