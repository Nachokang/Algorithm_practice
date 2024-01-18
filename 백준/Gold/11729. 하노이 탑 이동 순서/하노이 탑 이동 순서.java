import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        bw.write((int)Math.pow(2, N)-1 + "\n");

        hanoi(1, 3, N);

        bw.close();

    }

    static void hanoi(int a, int b, int n) throws IOException {

        if(n == 1) {
            bw.write(a + " " + b + "\n");
            return;
        }

        hanoi(a, 6-a-b, n-1);
        bw.write(a + " " + b + "\n");
        hanoi(6-a-b, b, n-1);

    }

}