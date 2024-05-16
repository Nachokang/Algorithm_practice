import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String nums = String.valueOf(n);
        
        char[] chars = nums.toCharArray();
        
        for(int i=0; i<nums.length(); i++) {
            chars[i] = nums.charAt(i);
        }
        
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder(new String(chars));
        sb.reverse();
        
        answer = Long.parseLong(String.valueOf(sb));
        
        return answer;
    }
}