package _03._0327.b11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] parents = new int[N+1];
        List<Integer>[] adj = new List[N+1];
        for (int i = 0; i < adj.length; i++) adj[i] = new ArrayList<>();

        for(int i = 0; i < N - 1; i++) {
            int[] edge = getEdge(br.readLine());
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        bfs(adj, parents);

        StringBuilder sb = new StringBuilder();
        for(int i = 2; i < parents.length; i++) {
            sb.append(parents[i]).append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    private static void bfs(List<Integer>[] adjList, int[] parents) {
        boolean[] visited = new boolean[adjList.length];
        Deque<Integer> q = new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()) {
            int curr = q.poll();
            for (int adj : adjList[curr]) {
                if(!visited[adj]){
                    parents[adj] = curr;
                    q.offer(adj);
                }
            }
            visited[curr] = true;
        }
    }

    private static int[] getEdge(String line) {
        int idx = 0;
        for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ' ') {
                idx = i;
                break;
            }
        }
        return new int[]{
                Integer.parseInt(line.substring(0, idx)),
                Integer.parseInt(line.substring(idx+1))
        };
    }
}
