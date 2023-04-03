package _04._0403.b1890;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputUtil iu = new InputUtil();
        int N = iu.nextInt();
        int[][] arr = new int[N + 1][N + 1];
        for(int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = iu.nextInt();
            }
        }
        long[][] cases = new long[N + 1][N + 1];
        cases[1][1] = 1;
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if(cases[i][j] == 0 || arr[i][j] == 0) continue;
                int jump = arr[i][j];
                if(i+jump <= N) {
                    cases[i+jump][j] += cases[i][j];
                }
                if(j+jump <= N) {
                    cases[i][j+jump] += cases[i][j];
                }
            }
        }
        System.out.println(cases[N][N]);
    }


    public static class InputUtil {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        public int nextInt() throws IOException {
            if(st == null || !st.hasMoreTokens()) {
                this.st = new StringTokenizer(br.readLine());
                return nextInt();
            }
            return Integer.parseInt(st.nextToken());
        }
    }
}
