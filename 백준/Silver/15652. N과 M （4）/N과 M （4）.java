import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] isUsed;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[10];
        isUsed = new boolean[10];

        printArr(0, 1);
        bw.close();

    }

    static void printArr(int k, int start) throws IOException {

        if(k==M) {
            for(int i=0; i<M; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i = start; i<=N; i++) {
            if(!isUsed[i]) {
                arr[k] = i;
                printArr(k+1, i);
                isUsed[i] = false;
            }
        }
    }
}