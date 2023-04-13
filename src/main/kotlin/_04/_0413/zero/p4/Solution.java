package _04._0413.zero.p4;

class Solution {
    int n;
    int num = 1;
    int maxDepth;
    int[][] arr;
    int i, j;
    public int solution(int n, int i, int j) {
        this.n = n;
        arr = new int[n][n];
        maxDepth = (int)(Math.log(n) / Math.log(2));
        this.i = i;
        this.j = j;
        recur(0, 0, 1, n*n);
        return arr[i][j];
    }

    private void recur(int i, int j, int depth, int value) {
        if(depth==maxDepth + 1) {
            arr[i][j] = value;
            return;
        }
        int nextWidth = n / (int)(Math.pow(2, depth));
        if(this.i < i + nextWidth && this.i >= i){
            if(this.j < j + nextWidth*2 && this.j >= j + nextWidth)
                recur(i, j + nextWidth, depth+1, value / 4);
            else
                recur(i, j, depth+1, value / 2);
        } else if(this.i < i + nextWidth*2 && this.i >= i + nextWidth) {
            if(this.j < j + nextWidth && this.j >= j)
                recur(i + nextWidth, j, depth+1, value / 2 + value / 4);
            else
                recur(i + nextWidth, j + nextWidth, depth+1, value);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(4, 1, 3);
        System.out.println(solution1);
    }
}
