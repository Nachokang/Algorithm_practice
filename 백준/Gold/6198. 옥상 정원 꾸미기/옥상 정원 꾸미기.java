import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static long answer;
    static Stack<Integer> s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        s = new Stack<>();

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());

            while(!s.isEmpty()) {
                if(s.peek() <= height) {
                    s.pop();
                }
                else {
                    break;
                }
            }
            answer += s.size();
            s.push(height);
        }
        
        System.out.print(answer);
    }
}