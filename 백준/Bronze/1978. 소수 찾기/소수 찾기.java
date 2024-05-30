import java.util.*;
import java.io.*;

class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }

        return true;
    }
}