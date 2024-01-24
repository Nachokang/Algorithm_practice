import java.io.*;
import java.util.*;

public class Main {
    static int T;
    static int M;
    static int N;
    static int K;
    static int[][] board;
    static boolean[][] visited;
    static int[] nrow = {1, 0, -1, 0};
    static int[] ncol = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());

        for(int i = 0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            board = new int[N][M];
            visited = new boolean[N][M];

            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int col = Integer.parseInt(st.nextToken());
                int row = Integer.parseInt(st.nextToken());
                board[row][col] = 1;
            }

            int worm = BFS(0,0);
            System.out.println(worm);
        }
    }

    static int BFS(int srow, int scol) {
        Queue<Node> q = new LinkedList<>();
        int worm = 0;


        for(int i=srow; i<N; i++) {
            for(int j=scol; j<M; j++) {
                if(board[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                worm++;
                visited[i][j] = true;
                q.add(new Node(i, j));

                while(!q.isEmpty()) {
                    Node curr = q.remove();

                    for(int k=0; k<4; k++) {
                        int nr = curr.row + nrow[k];
                        int nc = curr.col + ncol[k];

                        if(nr<0 || nr>=board.length || nc<0 || nc>=board[0].length) {
                            continue;
                        }
                        if(visited[nr][nc] || board[nr][nc]!=1) {
                            continue;
                        }

                        visited[nr][nc] = true;
                        q.add(new Node(nr, nc));
                    }
                }
            }
        }
        return worm;
    }

    static class Node {
        int row;
        int col;

        public Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}