import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int S;
    static int[] numbers;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        numbers = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0);

        if(S==0) {
            count-=1;
        }
        
        System.out.println(count);

    }

    static void DFS(int depth, int sum) {
        if(depth==N) {
            if(sum==S) {
                count++;
            }
            return;
        }

        DFS(depth+1, sum+numbers[depth]);
        DFS(depth+1, sum);


    }
}