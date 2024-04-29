import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch(command) {
                case "push":
                    s.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(!s.isEmpty()) {
                        System.out.println(s.pop());
                    }
                    else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(s.size());
                    break;
                case "empty":
                    if(!s.isEmpty()) {
                        System.out.println(0);
                    }
                    else {
                        System.out.println(1);
                    }
                    break;
                case "top":
                    if(!s.isEmpty()) {
                        System.out.println(s.peek());
                    }
                    else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}