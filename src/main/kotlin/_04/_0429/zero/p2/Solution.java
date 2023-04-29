package _04._0429.zero.p2;

import java.util.*;
class Solution {
    int[] s;
    int[] w;
    int target;
    int min = Integer.MAX_VALUE;
    boolean used[];
    public int solution(int[] sweetness, int[] weights, int target) {
        this.s = sweetness;
        this.w = weights;
        this.target = target;
        this.used = new boolean[s.length];
        perm(0);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private void perm(int depth) {
        int sSum = 0;
        int wSum = 0;
        for(int i = 0; i < used.length; i++) {
            if(!used[i]) continue;
            sSum += s[i];
            wSum += w[i];
            if(sSum == target) {
                min = Math.min(min, wSum);
                break;
            } else if (sSum > target) {
                break;
            }
        }
        for(int i = depth; i < s.length; i++) {
            if (!used[i]) {
                used[i] = true;
                perm(i);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(
                new int[]{12, 1, 3},
                new int[]{1, 2, 3},
                13
        ));
    }
}
