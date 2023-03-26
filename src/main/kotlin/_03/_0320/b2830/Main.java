package _0320.b2830;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ones = new int[20]; // name은 2진수로 최대 20자리
        for (int i = 0; i < n; i++) {
            int name = Integer.parseInt(br.readLine());
            for(int j = 0; j < 20; j++) {
                if((name & (1 << j)) > 0) ones[j]++;
            }
        }

        long sum = 0L;
        for (int i = 0; i < 20; i++) {
            // 0의 개수 * 1의 개수 * 2^자리수
            sum += (1L << i) * ones[i] * (n - ones[i]);
        }
        System.out.println(sum);
    }
}
