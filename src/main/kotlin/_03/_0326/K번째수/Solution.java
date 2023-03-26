package _03._0326.K번째수;

import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int[] sorted = new int[commands[i][1]-commands[i][0]+1];
            System.arraycopy(array, commands[i][0]-1, sorted, 0, sorted.length);
            Arrays.sort(sorted);
            answer[i] = sorted[commands[i][2]-1];
        }
        return answer;
    }
}
