import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int E;
    static int[][] board;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        E = Integer.parseInt(st.nextToken());

        board = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            board[x][y] = board[y][x] = 1;
        }

        System.out.println(BFS(1));
    }

    static int BFS(int start) {
        int affected = 0;
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {
            int curr = q.remove();

            for(int i=1; i<=N; i++) {
                if(visited[i] || board[curr][i]!=1) {
                    continue;
                }
                visited[i] = true;
                q.add(i);
                affected++;
            }
        }
        return affected;
    }
}