import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zerocnt = 0;
        int binarycnt = 0;

        while(!s.equals("1")) {
            for(char c : s.toCharArray()) {
                if (c == '0') {
                    zerocnt++;
                }
            }
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            binarycnt++;
        }

        answer[0] = binarycnt;
        answer[1] = zerocnt;


        return answer;
    }
}