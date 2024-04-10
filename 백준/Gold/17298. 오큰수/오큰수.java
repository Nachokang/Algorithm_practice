import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] num;
    static Stack<Integer> s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        num = new int[N];
        s = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++) {
            while(!s.isEmpty() && num[s.peek()]<num[i]) {
                num[s.pop()] = num[i];
            }

            s.push(i);
        }

        while(!s.isEmpty()) {
            num[s.pop()] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            sb.append(num[i]).append(" ");
        }
        
        System.out.print(sb);
    }
}