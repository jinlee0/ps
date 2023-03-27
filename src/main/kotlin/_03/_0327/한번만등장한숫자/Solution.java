package _03._0327.한번만등장한숫자;

import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String s) {
        return s.chars()
                .mapToObj(i -> (char)i)
                .collect(
                        Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1))
                )
                .entrySet().stream()
                .filter(e -> e.getValue()==1)
                .map(Map.Entry::getKey)
                .sorted()
                .reduce(
                        new StringBuilder(),
                        StringBuilder::append,
                        StringBuilder::append
                )
                .toString();

    }
}
