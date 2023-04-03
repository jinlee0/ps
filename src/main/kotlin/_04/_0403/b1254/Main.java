package _04._0403.b1254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String S = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int idx = 0;
        while(!isPalindrome(S, idx)){
            idx++;
        }
        System.out.println(idx + S.length());
    }

    private static boolean isPalindrome(String S, int start) {
        int end = S.length()-1;
        while(start < end) {
            if(S.charAt(start) != S.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
