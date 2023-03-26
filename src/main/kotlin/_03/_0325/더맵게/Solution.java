package _0325.더맵게;

import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int s : scoville) q.offer(s);
        while(q.peek() < K) {
            if(q.size() < 2) return -1;
            q.offer(q.poll() + q.poll() * 2);
            count++;
        }
        return count;
    }
}
