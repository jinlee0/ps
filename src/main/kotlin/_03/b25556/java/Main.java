package _0313.b25556.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] tops = new int[4];

        String result = "YES";
        first: for (int i : arr) {
            for (int j = 0; j < tops.length; j++) {
                if(i > tops[j]) {
                    tops[j] = i;
                    continue first;
                }
            }
            result = "NO";
            break;
        }
        System.out.println(result);
    }
}
