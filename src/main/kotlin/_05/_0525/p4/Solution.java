package _05._0525.p4;

import java.util.*;
class Solution {
    public int[] solution(String nums) {
        List<Integer> list = new ArrayList<>();
        loop: for(int i = 1; i <= nums.length() - 1; i++) {
            for(int j = i+1; j < nums.length(); j++) {
                int first = valid(nums.substring(0, i));
                int second = valid(nums.substring(i, j));
                if(first == -1 || second == -1) continue;
                list.add(first);
                list.add(second);
                list = validFibo(nums, j, first, second, list);
                if(!list.isEmpty()) {
                    break loop;
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    private List<Integer> validFibo(String nums, int s, int first, int second, List<Integer> list) {
        if(s == nums.length()) return list;
        int value = 0;
        int expected = first + second;
        for(int i = s; i < nums.length(); i++) {
            value = value * 10 + (nums.charAt(i) - '0');
            if(value > expected) {
                return new ArrayList<>();
            } else if (value == expected) {
                list.add(value);
                return validFibo(nums, i+1, second, value, list);
            }
        }
        return new ArrayList<>();
    }

    private int valid(String num) {
        if(!num.equals("0") && num.charAt(0) == '0') return -1;
        try {
            return Integer.parseInt(num);
        } catch(Exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution("14152944");
        System.out.println(Arrays.toString(solution1));
    }
}
