package _04._0420.zero.p4;

class Solution {
    public int solution(int delay, int capacity, int[] times) {
        int currCount = 0;
        int currMillis = 0;
        int miss = 0;
        for(int i = 0; i < times.length; i++) {
            currCount++;
            currMillis += times[i];
            if(currMillis >= delay) {
                currMillis -= delay;
                currCount--;
            }
            if(currCount > capacity) {
                miss++;
                currCount = capacity;
            }
        }
        return miss;
    }
}
