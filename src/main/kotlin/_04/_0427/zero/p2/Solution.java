package _04._0427.zero.p2;

import java.util.*;

// FAILED
class Solution {
    int[] numbers;
    int target;
    int min = -1;

    public int solution(int[] numbers, int target) {
        this.min = -1;
        this.numbers = numbers;
        this.target = target;
        Arrays.sort(numbers);
        dfs(numbers.length-1, 0, 0);
        return min;
    }

    public void dfs(int curr, int cnt, int sum) {
        sum += numbers[curr];
        if(sum == target) {
            min = cnt + 1;
            return;
        } else if (sum < target) {
            if(curr == 0) return;
            for(int i = numbers.length-1; i >= 0; i--) {
                if(min != -1) return;
                dfs(i, cnt+1, sum);
            }
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{0, 2, 4}, 17));
        System.out.println(solution.solution(new int[]{0, 2, 3, 4}, 17));
        System.out.println(solution.solution(new int[]{1, 2, 3}, 0));
        System.out.println(solution.solution(new int[]{1, 2, 4, 16}, 17));
    }
}
