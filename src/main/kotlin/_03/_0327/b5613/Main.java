package _03._0327.b5613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(br.readLine());
        w:while(true) {
            String token = br.readLine();
            if(token.equals("=")) break;
            int num = Integer.parseInt(br.readLine());
            switch (token) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    result /= num;
                    break;
                default:
                    break w;
            }
        }
        System.out.println(result);

    }
}
