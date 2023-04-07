package _04._0407.피로도;
class Solution {

    public int solution(int k, int[][] dungeons) {
        int[] result = new int[1];
        maxCount(dungeons, new boolean[dungeons.length], k, 0, result);
        return result[0];
    }

    private void maxCount(int[][] dungeons, boolean[] visited, int curr, int cnt, int[] result) {
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i] || curr < dungeons[i][0]) continue;
            visited[i] = true;
            maxCount(dungeons, visited, curr - dungeons[i][1], cnt + 1, result);
            visited[i] = false;
        }
        result[0] = Math.max(cnt, result[0]);
    }
}

