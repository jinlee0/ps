package _0317.프린터;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int p : priorities) list.add(p);

        Arrays.sort(priorities);
        int count = 0;
        int idx = location;
        while(true) {
            int p = list.removeFirst();
            if(p >= priorities[priorities.length - 1 - count]) {
                count++;
                if(idx == 0) // 최댓값이고 목표 인덱스인 경우
                    return count;
                // 우선순위가 같지만 목표 인덱스(location)가 아닌 경우
                idx--; // idx!=0이므로 idx--해서 음수가 될 순 없다.
            } else {
                list.addLast(p);
                idx = idx - 1 < 0 ? list.size() - 1 : idx - 1;
            }
        }
    }
}