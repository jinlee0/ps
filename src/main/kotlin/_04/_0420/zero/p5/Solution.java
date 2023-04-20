package _04._0420.zero.p5;

class Solution {
    public int[][] solution(int[][] image, int K) {
        int[][] result = new int[image.length][image[0].length];
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[0].length; j++) {
                result[i][j] = mean(image, i, j, K);
            }
        }
        return result;
    }

    private int mean(int[][] arr, int i, int j, int K) {
        int width = K/2;
        int rowMin = Math.max(0, i-width);
        int rowMax = Math.min(arr.length-1, i + width);
        int colMin = Math.max(0, j-width);
        int colMax = Math.min(arr[0].length-1, j+width);
        int sum = 0;
        for(int r = rowMin; r <= rowMax; r++) {
            for(int c = colMin; c <= colMax; c++) {
                sum += arr[r][c];
            }
        }
        return sum / (K*K);
    }
}
