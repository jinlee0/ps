package _0320.b16459;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> sentences = new LinkedList<>();
        while(true) {
            String sentence = br.readLine();
            if(sentence.equals("0")) break;
            sentences.add(sentence);
        }

        Map<String, String> map = new HashMap<>();
        map.put("WHO", br.readLine());
        map.put("WHERE", br.readLine());
        map.put("WHAT", br.readLine());

        for (int i = 0; i < sentences.size(); i++) {
            StringTokenizer st = new StringTokenizer(sentences.get(i));
            StringJoiner sj = new StringJoiner(" ");
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if(map.containsKey(token)) token = map.get(token);
                else {
                    String substring = token.substring(0, token.length() - 1);
                    if(map.containsKey(substring)) token = map.get(substring)+".";
                }
                sj.add(token);
            }
            sentences.set(i, sj.toString());
        }

        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for (String sentence : sentences) {
            sj.add(sentence);
        }
        System.out.println(sj);
    }
}
