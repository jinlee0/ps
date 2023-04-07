package _04._0407.전력량을_둘로_나누기;

/**
 * 처음에 bfs로 풀고 다른 사람의 풀이를 봤는데 아래와 같다.
 * 기존 풀이와 큰 차이점은, 기존에는 각 서브트리의 노드 개수를 구했다면 아래에서는 한 서브트리의 노드 개수만 구하고 전체 노드 개수에서 제한다.
 * class attribute, dfs를 적극적으로 사용해야겠다.
 */
class Solution {
    int N, min;
    boolean[][] map;
    boolean[] vst;

    int dfs(int n){
        vst[n] = true;
        int child = 1;
        for(int i = 1; i <= N; i++) {
            if(!vst[i] && map[n][i]) {
                child += dfs(i);
            }
        }
        min = Math.min(min, Math.abs(child - (N - child)));
        return child;
    }

    public int solution(int n, int[][] wires) {
        N = n;
        min = n;
        map = new boolean[n+1][n+1];
        vst = new boolean[n+1];
        for(int[] wire : wires) {
            int a = wire[0], b = wire[1];
            map[a][b] = map[b][a] = true;
        }
        dfs(1);
        return min;
    }
}
