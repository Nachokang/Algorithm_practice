import java.util.*;
import java.io.*;

public class Main {
    static int N, K;
    static boolean[] visited;
    static int time;
    static int MAX_POINT = 100000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[MAX_POINT+1];

        BFS(N);
    }

    static void BFS(int start) {
        Queue<Node> q = new LinkedList<>();
        visited[start] = true;
        q.add(new Node(start, 0));

        while(!q.isEmpty()) {
            Node curr = q.remove();

            if(curr.row == K) {
                System.out.println(curr.dist);
                return;
            }

            int[] dir = new int[]{1, -1};
            int teleport = curr.row * 2;

            for(int i=0; i<2; i++) {
                int walk = curr.row + dir[i];
                if(walk > MAX_POINT || walk < 0) {
                    continue;
                }
                if(visited[walk]) {
                    continue;
                }
                visited[walk] = true;
                q.add(new Node(walk, curr.dist+1));
            }

            if(teleport <= MAX_POINT && !visited[teleport]) {
                visited[teleport] = true;
                q.add(new Node(teleport, curr.dist+1));
            }
        }
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