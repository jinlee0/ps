package _04._0427.zero.p4;

class Solution {
    public int solution(int x1, int y1, int x2, int y2) {
        int times = 0;
        while(x1 != x1 || y2 != y2) {
            int distX = x1 - x2;
            int distY = y1 - y2;
            if(Math.abs(distX) + Math.abs(distY) == 1)
                return times + 1;
            if(Math.abs(distX) > Math.abs(distY)) {
                // 철수는 x축으로 움직인다.
                if(distX > 0) { // 철수는 서쪽으로 움직인다.
                    x1--;
                    if(distY > 0) { // 영희는 북동쪽으로 움직인다.
                        x2++; y2++;
                    } else { // 영희는 남동
                        x2++; y2--;
                    }
                } else { // 철수 동
                    x1++;
                    if(distY > 0) { // 영희는 북서쪽으로 움직인다.
                        x2--; y2++;
                    } else { // 영희는 남서
                        x2--; y2--;
                    }
                }
            } else {
                // 철수 y
                if(distY > 0) { // 철수 남
                    y1--;
                    if(distX > 0) { // 연희 북동
                        x2++; y2++;
                    } else { // 연희 북서
                        x2--; y2++;
                    }
                } else { // 철수 북
                    y1++;
                    if(distX > 0) { // 영희 남동
                        x2++; y2--;
                    } else {
                        x2--; y2--;
                    }
                }
            }
            System.out.printf("%d %d %d %d\n", x1, y1, x2, y2);
            times++;
        }
        return times;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(-2, 5, 4, 2));
    }
}
