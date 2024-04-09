import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static Stack<int[]> s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        s = new Stack<>();

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            int curr_height = Integer.parseInt(st.nextToken());

            while(!s.isEmpty()) {
                if(s.peek()[1] >= curr_height) {
                    System.out.print(s.peek()[0] + " ");
                    break;
                }
                else {
                    s.pop();
                }
            }

            if(s.isEmpty()) {
                System.out.print("0 ");
            }
            s.push(new int[] {i+1, curr_height});
        }
    }
}