import java.util.*;

public class Solution {
    static int answer = 0;
    public int solution(int N) {
        int temp = 0;

        String s = String.valueOf(N);
        for(int i=0; i<s.length(); i++) {
            temp = Integer.parseInt(String.valueOf(s.charAt(i)));

            answer += temp;
        }

        return answer;
    }
}