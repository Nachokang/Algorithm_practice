import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int back = 0;

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command) {
                case "push":
                    back = Integer.parseInt(st.nextToken());
                    q.add(back);
                    break;
                case "pop":
                    if(!q.isEmpty()) {
                        System.out.println(q.remove());
                    }
                    else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if(!q.isEmpty()) {
                        System.out.println(0);
                    }
                    else {
                        System.out.println(1);
                    }
                    break;
                case "front":
                    if(!q.isEmpty()) {
                        System.out.println(q.peek());
                    }
                    else {
                        System.out.println(-1);
                    }
                    break;
                case "back":
                    if(!q.isEmpty()) {
                        System.out.println(back);
                    }
                    else {
                        System.out.println(-1);
                    }
            }
        }
    }
}