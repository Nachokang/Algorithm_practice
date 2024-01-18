import java.io.*;
import java.util.*;

public class Main {

    static int A;
    static int B;
    static int C;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A, B, C));

    }

    static long pow(int a, int b, int c) {
        if(b == 0) {
            return 1;
        }

        long num = pow(a, b/2, c);

        if(b%2==0) {
            return num * num % c;
        }
        else {
            return (num * num % c) * a % c;
        }
    }
}