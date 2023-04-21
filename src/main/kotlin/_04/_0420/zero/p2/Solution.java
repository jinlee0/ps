package _04._0420.zero.p2;
class Solution {
    public int[] solution(int[] a, int[] b) {
        int idx = 0;

        int[] big, small;
        if(a.length > b.length) {
            big = a; small = b;
        } else {
            big = b; small = a;
        }

        int acc = 0;
        while(idx < big.length) {
            int sum = acc;
            sum += get(a, idx);
            sum += get(b, idx);
            if(sum > 9) {
                sum -= 10;
                acc = 1;
            } else {
                acc = 0;
            }
            big[big.length-1-idx] = sum;
            idx++;
        }

        int[] result;
        if(acc > 0) {
            result = new int[big.length + 1];
            result[0] = 1;
        } else {
            return big;
        }

        for(int i = 0; i < big.length; i++) {
            result[i+1] = big[i];
        }
        return result;
    }

    private int get(int[] arr, int idx) {
        if(idx < arr.length) {
            return arr[arr.length - 1 - idx];
        } else {
            return 0;
        }
    }
}