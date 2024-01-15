import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] board;
    static boolean[] Bfsvisited;
    static boolean[] Dfsvisited;
    static int N;
    static int M;
    static int V;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        board = new int[N+1][N+1];
        Bfsvisited = new boolean[N+1];
        Dfsvisited = new boolean[N+1];

        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            board[n1][n2] = board[n2][n1] = 1;
        }

            dfs(V);
            System.out.println();
            bfs(V);
    }

    public static void dfs(int start) {
        Dfsvisited[start] = true;
        System.out.print(start + " ");

        for(int i = 1; i<=N; i++) {
            if(board[start][i] == 1 && !Dfsvisited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();

        Bfsvisited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 1; i<=N; i++) {
                if(Bfsvisited[i] || board[curr][i] != 1) {
                    continue;
                }
                Bfsvisited[i] = true;
                q.add(i);
            }
        }
    }
}