package _0317.b1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append('<');
        StringJoiner sj = new StringJoiner(", ");

        List<Integer> list = IntStream.range(1, N + 1).boxed().collect(Collectors.toList());
        int curr = 0;
        while (!list.isEmpty()) {
            curr = (curr + K - 1) % list.size();
            sj.add(list.remove(curr).toString());
        }
        sb.append(sj);
        sb.append('>');
        System.out.println(sb);
    }
}
