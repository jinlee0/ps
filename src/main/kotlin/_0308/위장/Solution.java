package _0308.위장;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(String[] c : clothes)
            map.put(c[1], map.getOrDefault(c[1], 1) + 1);

        int result = 1;
        for(String key : map.keySet())
            result *= map.get(key);

        return result - 1;
    }
}