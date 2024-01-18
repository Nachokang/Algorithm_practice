import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int[] A, B;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];
        B = new int[M];
        int[] C = new int[N+M];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int j=0; j<M; j++) {
            B[j] = Integer.parseInt(st.nextToken());
        }

        int aidx = 0;
        int bidx = 0;

        for(int i=0; i<N+M; i++) {

            if(aidx < N && (bidx >= M || A[aidx]<=B[bidx])) {
                C[i] = A[aidx];
                aidx++;
            }
            else {
                C[i] = B[bidx];
                bidx++;
            }
        }

        for(int c : C) {
            bw.write(c + " ");
        }
        
        bw.close();
    }
}