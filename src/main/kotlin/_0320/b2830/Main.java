package _0320.b2830;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] results = new int[20]; // name은 2진수로 최대 20자리
        for (int i = 0; i < n; i++) {
            int name = Integer.parseInt(br.readLine());
            int x = 0;
            while(true) {
                if(name >> 1 == 0) {
                    results[x]++;
                    break;
                }
                results[x++] += name - ((name >> 1) << 1);
                name >>= 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < 20; i++) {
            sum += results[i] * (n - results[i]) * (1 << i);
        }
        System.out.println(sum);
    }
}
