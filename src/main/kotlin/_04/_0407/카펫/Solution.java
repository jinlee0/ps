package _04._0407.카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        for(int i = 3; i <= brown; i++) {
            if(area % i == 0 && yellow % (i-2) == 0 && (area / i + i) * 2 - 4 == brown)
                return new int[]{area/i, i};
        }
        return null;
    }
}