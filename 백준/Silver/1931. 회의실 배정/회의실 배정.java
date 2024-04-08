import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] schedule;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        schedule = new int[N][2];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            schedule[i][0] = Integer.parseInt(st.nextToken());
            schedule[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(schedule, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });
        
        int prevEndTime = 0;
        
        for(int i=0; i<N; i++) {
            if(prevEndTime <= schedule[i][0]) {
                prevEndTime = schedule[i][1];
                answer++;
            }
        }
        System.out.print(answer);
    }
}