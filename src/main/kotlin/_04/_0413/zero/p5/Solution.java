package _04._0413.zero.p5;

import java.util.*;
class Solution {
    int[] rooms;
    int[] capacity;
    int N, M, K;
    long kPerm;
    int count = 0;
    public long solution(int N, int M, int K, int[] capacity) {
        rooms = new int[M];
        this.capacity = capacity;
        this.N = N;
        this.M = M;
        this.K = K;
        this.kPerm = perm(K, M);
        dfs(0, N);
        return this.count;
    }

    private void dfs(int curr, int remain) {
        if(curr >= rooms.length) {
            if(remain > 0) return;
            countCases();
            return;
        }
        for(int i = 0; i <= remain; i++) {
            if(i > capacity[curr]) break;
            rooms[curr] = i;
            dfs(curr+1, remain-i);
        }
    }

    private void countCases() {
        int sum = 1;
        int remain = N;
        for(int students : rooms) {
            sum *= comb(remain, students);
            remain -= students;
        }
        count += sum * kPerm;
    }

    private long perm(int n, int r) {
        long sum = 1;
        while(r > 0) {
            sum *= n--;
            r--;
        }
        return sum;
    }

    private long comb(int n, int r) {
        long result = 1;
        for(int i = 0; i < Math.min(r, n-r); i++) {
            result *= n - i;
            result /= i + 1;
        }
        return result;
    }
}
