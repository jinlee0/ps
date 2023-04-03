package _04._0403.b2167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tokenizer tokenizer = new Tokenizer(br);
        int N = tokenizer.nextInt();
        int M = tokenizer.nextInt();
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = tokenizer.nextInt();
            }
        }

        int K = tokenizer.nextInt();
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for(int k = 0; k < K; k++) {
            int i = tokenizer.nextInt();
            int j = tokenizer.nextInt();
            int x = tokenizer.nextInt();
            int y = tokenizer.nextInt();
            int sum = 0;
            for(int r = i-1; r < x; r++) {
                for(int c = j-1; c < y; c++) {
                    sum+=arr[r][c];
                }
            }
            sj.add(String.valueOf(sum));
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
