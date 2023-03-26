package _0320.b9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for(int i = 0; i < n; i++) {
            sj.add(isVPS(br.readLine()));
        }
        System.out.println(sj);
    }

    private static String isVPS(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if(c == '(') count++;
            else {
                if(count == 0) return "NO";
                count--;
            }
        }
        if(count==0) return "YES";
        else return "NO";
    }
}
