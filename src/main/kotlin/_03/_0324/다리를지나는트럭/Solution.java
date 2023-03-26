package _0324.다리를지나는트럭;

import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++) dq.add(0);
        int idx = 0;
        int sec = 0;
        int currWeight = 0;
        while(idx < truck_weights.length) {
            currWeight -= dq.removeFirst();
            if(currWeight+truck_weights[idx] <= weight) {
                int w = truck_weights[idx++];
                currWeight += w;
                dq.addLast(w);
            } else {
                dq.addLast(0);
            }
            sec++;
        }
        return sec + bridge_length;
    }
}
