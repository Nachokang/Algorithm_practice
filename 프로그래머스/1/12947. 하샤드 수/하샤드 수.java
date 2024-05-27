import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] xchararr = String.valueOf(x).toCharArray();
        int digit = xchararr.length;
        int sum = 0;
        
        for(int i=0; i<digit; i++) {
            sum += Integer.parseInt(String.valueOf(xchararr[i]));
        }
        
        if(x%sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}