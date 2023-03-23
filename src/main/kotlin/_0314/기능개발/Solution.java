package _0314.기능개발;

import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        int[] deploys = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++) {
            deploys[i] = (int) Math.ceil((100.0 - progresses[i])/speeds[i]);
        }
        List<Integer> answer = new ArrayList<>();
        int first = 0;
        while(true) {
            if(first == progresses.length) break;
            int last = first;
            int sum = 0;
            while(true) {
                if(last == progresses.length || deploys[last] > deploys[first]) {
                    first = last;
                    break;
                }
                last++;
                sum++;
            }
            answer.add(sum);
        }
        return answer;
    }
}
