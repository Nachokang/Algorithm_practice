import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(!dq.isEmpty()) {
                        System.out.println(dq.removeFirst());
                    }
                    else {
                        System.out.println(-1);
                    }
                    break;
                case "pop_back":
                    if(!dq.isEmpty()) {
                        System.out.println(dq.removeLast());
                    }
                    else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(dq.size());
                    break;
                case "empty":
                    if(!dq.isEmpty()) {
                        System.out.println(0);
                    }
                    else {
                        System.out.println(1);
                    }
                    break;
                case "front":
                    if(!dq.isEmpty()) {
                        System.out.println(dq.peekFirst());
                    }
                    else {
                        System.out.println(-1);
                    }
                    break;
                case "back":
                    if(!dq.isEmpty()) {
                        System.out.println(dq.peekLast());
                    }
                    else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}