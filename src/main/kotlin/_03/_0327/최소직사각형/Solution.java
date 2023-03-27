package _03._0327.최소직사각형;

class Solution {
    public int solution(int[][] sizes) {
        for(int[] size : sizes) {
            if(size[0] > size[1]) swap(size, 0, 1);
        }
        int maxWidth = sizes[0][0];
        int maxHeight = sizes[0][1];
        for(int i = 1; i < sizes.length; i++) {
            maxWidth = Math.max(maxWidth, sizes[i][0]);
            maxHeight = Math.max(maxHeight, sizes[i][1]);
        }
        return maxWidth * maxHeight;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}