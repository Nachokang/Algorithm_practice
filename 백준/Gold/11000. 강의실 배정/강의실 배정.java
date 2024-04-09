import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static PriorityQueue<int[]> pq;
    static PriorityQueue<Integer> room;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        
        pq = new PriorityQueue<>(((o1, o2) -> {
            if(o1[0]==o2[0]) {
                return o1[1]-o2[1];
            }
            else {
                return o1[0]-o2[0];
            }
        }));
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            pq.offer(new int[]{start, end});
        }
        
        room = new PriorityQueue<>();
        room.offer(0);
        
        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            
            if(room.peek() <= curr[0]) {
                room.poll();
            }
            
            room.offer(curr[1]);
        }

        System.out.println(room.size());
    }
}