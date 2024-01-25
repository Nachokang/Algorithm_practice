import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int p1, p2;
    static int m;
    static int[][] board;
    static boolean[] visited;
    static int[] dist;
    static int chonsu;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        p1 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());

        board = new int[n+1][n+1];
        visited = new boolean[n+1];
        dist = new int[n+1];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            board[x][y] = board[y][x] = 1;
        }

        BFS(p1, p2);
        if(dist[p2]==0) {
            chonsu = -1;
        }
        else {
            chonsu = dist[p2];
        }
        System.out.println(chonsu);

    }

    static void BFS(int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {
            int curr = q.remove();
            if(curr == end) {
                break;
            }

            for(int i=1; i<=n; i++) {
                if(visited[i] || board[curr][i] != 1) {
                    continue;
                }
                visited[i] = true;
                q.add(i);
                dist[i] = dist[curr]+1;
            }
        }
    }
}