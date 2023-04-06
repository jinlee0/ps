package _04._0406.b27958;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputUtil iu = new InputUtil();
        int N = iu.nextInt();
        int K = iu.nextInt();
        int[][] init = new int[N+2][N+2];
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                init[i][j] = iu.nextInt();
            }
        }

        int[] bullets = new int[K];
        for(int i = 0; i < K; i++) {
            bullets[i] = iu.nextInt();
        }

        int[] permArr = new int[N];
        for(int i = 0; i < N; i++)
            permArr[i] = i + 1;
        ArrayList<int[]> resultList = new ArrayList<>();
        perm(permArr, new int[bullets.length], resultList, 0);

        int max = 0;
        for (int[] shots : resultList) {
            int score = doGame(init, shots, bullets);
            max = Math.max(max, score);
        }
        System.out.println(max);
    }

    private static int doGame(int[][] init, int[] shots, int[] bullets) {
        int n = init.length-2;
        int[][] targets = new int[n+2][n+2];
        int[][] benefits = new int[n+2][n+2];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                targets[i][j] = init[i][j];
                benefits[i][j] = init[i][j];
            }
        }
        int score = 0;
        for (int i = 0; i < shots.length; i++) {
            int r = shots[i];
            int bullet = bullets[i];
            for(int c = 1; c <= n; c++) {
                if(targets[r][c] == 0) {
                    continue;
                } else if(targets[r][c] >= 10) {
                    score += benefits[r][c];
                    benefits[r][c] = targets[r][c] = 0;
                } else {
                    targets[r][c] -= bullet;
                    if(targets[r][c] <= 0) {
                        score += benefits[r][c];
                        removeAndSpread(targets, benefits, r, c, benefits[r][c]);
                        benefits[r][c] = targets[r][c] = 0;
                    }
                }
                break;
            }
        }
        return score;
    }

    private static void removeAndSpread(int[][] targets, int[][] benefits, int r, int c, int benefit) {
        benefit = benefit / 4;
        set(targets, benefits, r-1, c, benefit);
        set(targets, benefits, r+1, c, benefit);
        set(targets, benefits, r, c-1, benefit);
        set(targets, benefits, r, c+1, benefit);
    }

    private static void set(int[][] targets, int[][] benefits, int r, int c, int value) {
        if(targets[r][c] > 0) return;
        targets[r][c] = value;
        benefits[r][c] = value;
    }

    private static void perm(int[] arr, int[] result, List<int[]> resultList, int depth) {
        if(depth == result.length) {
            resultList.add(Arrays.copyOf(result, result.length));
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            result[depth] = arr[i];
            perm(arr, result, resultList, depth + 1);
        }
    }

    public static class InputUtil {
        public int nextInt() throws IOException {
            int read = System.in.read();
            while(read < '0' || read > '9') read = System.in.read();
            int num = 0;
            while(read >= '0' && read <= '9') {
                num *= 10;
                num += read - '0';
                read = System.in.read();
            }
            return num;
        }
    }
}
