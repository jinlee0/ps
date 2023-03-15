package _0314.b1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " " +  br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] indices = new int[Integer.parseInt(st.nextToken())];
        for(int i = 0; i < indices.length; i++) {
            indices[i] = Integer.parseInt(st.nextToken()) - 1;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < N; i++) queue.add(i);

        int sum = 0;
        for(int i = 0; i < indices.length; i++) {
            int index = queue.indexOf(indices[i]);
            int fromFirst = index;
            int fromLast = queue.size() - index;
            if (fromFirst < fromLast) {
                for (int j = 0; j < fromFirst; j++)
                    queue.addLast(queue.pollFirst());
                sum += fromFirst;
            } else {
                for (int j = 0; j < fromLast; j++)
                    queue.addFirst(queue.pollLast());
                sum += fromLast;
            }
            queue.poll();
        }
        System.out.println(sum);
    }
}
