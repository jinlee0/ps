package _04._0403.b2167.better;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tokenizer tokenizer = new Tokenizer(br);
        int N = tokenizer.nextInt();
        int M = tokenizer.nextInt();
        int[][] arr = new int[N+1][M+1];
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            arr[i][0] = sum;
            for(int j = 1; j <= M; j++) {
                sum += tokenizer.nextInt();
                arr[i][j] = sum;
            }
        }

        int K = tokenizer.nextInt();
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for(int k = 0; k < K; k++) {
            int i = tokenizer.nextInt();
            int j = tokenizer.nextInt();
            int x = tokenizer.nextInt();
            int y = tokenizer.nextInt();
            int acc = 0;
            for(int r = i; r <= x; r++) {
                acc += arr[r][y] - arr[r][j - 1];
            }
            sj.add(String.valueOf(acc));
        }
        System.out.println(sj);
    }

    public static class Tokenizer {
        private BufferedReader br;
        private StringTokenizer st;

        public Tokenizer(BufferedReader br) {
            this.br = br;
        }

        public int nextInt() throws IOException {
            if(st == null || !st.hasMoreTokens()) {
                this.st = new StringTokenizer(br.readLine());
                return nextInt();
            }
            return Integer.parseInt(st.nextToken());
        }
    }
}
