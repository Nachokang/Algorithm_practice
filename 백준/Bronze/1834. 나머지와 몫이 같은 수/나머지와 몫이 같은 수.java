import java.io.*;
import java.util.*;

public class Main {
    static long N;
    static long answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int i = 1;

        while(true) {
            if(cnt==N-1) break;
            answer += (N+1)*i;
            i++;
            cnt++;
        }

        System.out.print(answer);

        // N+1부터 시작해서 연속하는 배수 N-1개의 합
    }
}