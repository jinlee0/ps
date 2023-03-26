package _0318.디스크컨트롤;
import java.util.*;
import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (o1, o2) -> o1[1] - o2[1]
        );

        int sum = 0;
        int offset = 0;
        int idx = 0;
        int remain = jobs.length;
        while(remain > 0) {
            while(idx < jobs.length &&jobs[idx][0] <= offset)
                queue.add(jobs[idx++]);
            if(queue.isEmpty()) {
                offset = jobs[idx][0];
                continue;
            }
            int[] next = queue.poll();
            int s = Math.max(next[0], offset);
            int e = offset = s + next[1];
            sum += e - next[0];
            remain--;
        }
        return sum / jobs.length;
    }
}