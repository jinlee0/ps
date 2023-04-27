package _04._0427.zero.p3;

import java.util.*;
import java.util.*;
class Solution {
    public int solution(int delay, int N) {
        int[] delays = new int[delay + 1];
        delays[0] = 1;
        int sum = 0;
        for(int i = 0; i < N; i++) {
            int ready = delays[0];
            sum += ready;
            recover(delays);
            delays[0] += ready;
            delays[delays.length-1] += ready;
        }
        for(int d : delays) sum += d;
        return sum;
    }

    private void recover(int[] delays) {
        for(int i = 1; i < delays.length; i++)
            delays[i-1] = delays[i];
        delays[delays.length-1] = 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(0, 50));
    }
}
