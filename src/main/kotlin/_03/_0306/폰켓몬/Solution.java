package _0306.폰켓몬;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        return Math.min(set.size(), nums.length/2);
    }

    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
    }
}

