import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] coins;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        coins = new int[N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            coins[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=N-1; i>=0; i--) {
            if(coins[i] <= K) {
                answer += K/coins[i];
                K %= coins[i];
            }
        }

        System.out.print(answer);

    }
}