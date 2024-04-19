import java.util.*;
import java.io.*;

public class Main {
    static int F,S,G,U,D;
    static boolean[] visited;
    static String STAIRS = "use the stairs";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());   //현재층
        G = Integer.parseInt(st.nextToken());   //목표층
        U = Integer.parseInt(st.nextToken());   //위로 갈 수 있는 층
        D = Integer.parseInt(st.nextToken());   //아래로 갈 수 있는 층

        visited = new boolean[F+1];

        BFS(S);

    }

    static void BFS(int start) {
        Queue<Node> q = new LinkedList<>();
        visited[start] = true;
        q.add(new Node(start, 0));

        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr.row == G) {
                System.out.println(curr.dist);
                return;
            }

            int next_up = curr.row+U;
            int next_down = curr.row-D;

            if(next_up <= F && !visited[next_up]) {
                visited[next_up] = true;
                q.add(new Node(next_up, curr.dist+1));
            }
            if(next_down >= 1 && !visited[next_down]) {
                visited[next_down] = true;
                q.add(new Node(next_down, curr.dist+1));
            }
        }

        System.out.println(STAIRS);
    }

    static class Node {
        int row;
        int dist;
        public Node(int row, int dist) {
            this.row = row;
            this.dist = dist;
        }
    }
}