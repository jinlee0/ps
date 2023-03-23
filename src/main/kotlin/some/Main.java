package some;

import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Long> collect = new LinkedList<Character>()
                .stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); 
    }
}
