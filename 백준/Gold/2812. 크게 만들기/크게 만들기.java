import java.util.*;
import java.io.*;

public class Main {
    static int N, K;
    static Stack<Character> s;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        String numS = br.readLine();
        s = new Stack<>();
        int count = 0;
        
        for(int i=0; i<numS.length(); i++) {
            while(!s.isEmpty() && s.peek() < numS.charAt(i) && count < K) {
                s.pop();
                count++;
            }
            
            if(s.size() < N-K) {
                s.add(numS.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.size(); i++) {
            sb.append(s.get(i));
        }
        
        System.out.println(sb);
    }
}