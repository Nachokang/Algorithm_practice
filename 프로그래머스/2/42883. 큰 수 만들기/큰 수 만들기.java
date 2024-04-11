import java.util.*;
import java.io.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        
        Stack<Character> s = new Stack<>();
        int count = 0;
        
        for(int i=0; i<number.length(); i++) {
            while(!s.isEmpty() && s.peek() < number.charAt(i) && count < k) {
                s.pop();
                count++;
            }
            
            if(s.size() < number.length()-k) {
                s.add(number.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(Character c : s) {
            sb.append(c);
        }
        answer = String.valueOf(sb);
        return answer;
    }
}