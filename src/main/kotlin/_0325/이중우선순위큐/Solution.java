package _0325.이중우선순위큐;

import java.util.*;
class Solution {
    int size = 0;
    Queue<Integer> minHeap = new PriorityQueue<>();
    Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    public int[] solution(String[] operations) {
        for(String op : operations) {
            StringTokenizer st = new StringTokenizer(op);
            if(st.nextToken().equals("I")) {
                operateI(st.nextToken());
            } else {
                operateD(st.nextToken());
            }
        }
        fixHeaps();
        return size < 1 ?
                new int[]{0, 0} : new int[]{maxHeap.peek(), minHeap.peek()};
    }

    private void operateD(String param) {
        if(size < 1) return;
        if(param.charAt(0) == '-') {
            minHeap.poll();
        } else {
            maxHeap.poll();
        }
        size--;
    }

    private void operateI(String param) {
        int value = Integer.parseInt(param);
        fixHeaps();
        minHeap.offer(value);
        maxHeap.offer(value);
        size++;
    }

    private void fixHeaps() {
        if(maxHeap.size() != size) fixHeap(maxHeap);
        if(minHeap.size() != size) fixHeap(minHeap);
    }

    private void fixHeap(Queue<Integer> q) {
        int[] temp = new int[size];
        for(int i = 0; i < size; i++) temp[i] = q.poll();
        q.clear();
        for(int i = 0; i < size; i++) q.offer(temp[i]);
    }
}
