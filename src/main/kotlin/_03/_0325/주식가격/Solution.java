package _0325.주식가격;

class Solution {
    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            result[i] = prices.length - i - 1;
            for(int j = i+1; j < prices.length; j++) {
                if(prices[j] < prices[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
}
