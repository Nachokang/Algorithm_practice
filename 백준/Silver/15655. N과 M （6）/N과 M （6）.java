import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] isUsed;
    static int[] numbers;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        arr = new int[N];
        isUsed = new boolean[N];

        printArr(0, 0);
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

        for(int i = start; i<N; i++) {
            if(!isUsed[i]) {
                arr[k] = numbers[i];
                printArr(k+1, i+1);
            }
        }
    }
}