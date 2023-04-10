package _04._0410.모음사전;
import java.util.*;
class Solution {
    List<String> list = new ArrayList<>();
    void dfs(StringBuilder sb, int len) {
        if(len > 5) return;
        list.add(sb.toString());
        for(int i = 0; i < 5; i++)
            dfs(new StringBuilder(sb.toString()).append("AEIOU".charAt(i)), len + 1);
    }
    public int solution(String word) {
        dfs(new StringBuilder(), 0);
        System.out.println(list.get(123));
        return list.indexOf(word);
    }
}
