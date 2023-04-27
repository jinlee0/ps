package _04._0427.zero.p5;

// FAILED
class Solution {
    int[] reward;
    int[] health;
    int[] optional;
    boolean[] used;
    int minSec = Integer.MAX_VALUE;

    public int solution(int[] reward, int[] health, int[] optional) {
        minSec = Integer.MAX_VALUE;
        this.reward = reward;
        this.health = health;
        this.optional = optional;
        this.used = new boolean[reward.length];
        perm(0);
        return minSec;
    }

    private void perm(int depth) {
        if(depth >= reward.length - 1) {
            simulate();
        }
        for(int i = depth; i < reward.length; i++) {
            if(used[i]) continue;
            used[i] = true;
            perm(i);
            used[i] = false;
        }
    }

    private void simulate() {
        int sec = 0;
        int power = 1;
        for(int i = 0; i < reward.length; i++) {
            if(optional[i] == 1 && !used[i]) continue;
            int remain = health[i];
            while(remain > 0) {
                remain -= power;
                sec++;
            }
            power += reward[i];
        }
        this.minSec = Math.min(minSec, sec);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(
                new int[]{4,2,2,0,3,5},
                new int[]{10, 20, 20, 20, 40, 30},
                new int[]{1, 0, 1, 0, 0, 0}
        ));
        System.out.println(solution.solution(
                new int[]{1, 2, 2, 0, 3, 5},
                new int[]{10, 20, 20, 20, 40, 30},
                new int[]{1, 0, 1, 0, 0, 0}
        ));
    }
}
