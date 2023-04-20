package _04._0420.zero.p3;

import java.util.*;
class Solution {
    public String solution(String code) {
        Deque<Character> dq = new LinkedList<>();

        for(int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '}') {
                StringBuilder sb = new StringBuilder();
                while(dq.peekLast() != '{') {
                    sb.append(dq.removeLast());
                }
                dq.removeLast();
                int r = dq.removeLast() - '0';
                sb.reverse();
                for(int j = 0; j < r; j++) {
                    for(int k = 0; k < sb.length(); k++) {
                        dq.addLast(sb.charAt(k));
                    }
                }
            } else {
                dq.addLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : dq) {
            sb.append(c);
        }
        return sb.toString();
    }
}
