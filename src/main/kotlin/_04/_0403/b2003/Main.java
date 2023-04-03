package _04._0403.b2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputUtil input = new InputUtil();
        int N = input.nextInt();
        int M = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        int start = 0;
        int end = 1;
        int sum = arr[0];
        int count = 0;
        while(true) {
            if(sum < M) {
                if(end + 1 > N) break;
                sum += arr[end++];
            } else if (sum > M) {
                sum -= arr[start++];
            } else {
                count++;
                if(end + 1 > N) break;
                sum -= arr[start++];
                sum += arr[end++];
            }
        }
        System.out.println(count);
    }

    public static class InputUtil {
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
