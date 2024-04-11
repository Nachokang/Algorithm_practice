import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int lightidx = 0;
        
        for(int i=people.length-1; i>=lightidx; i--) {
            if((people[i] + people[lightidx]) <= limit) {
                answer++;
                lightidx++;
            }
            else {
                answer++;
            }
        }
        
        return answer;
    }
}

