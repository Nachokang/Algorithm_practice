import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int max_area = 0;
    static int[][] board;
    static int[] nrow = {1, 0, -1, 0};
    static int[] ncol = {0, 1, 0, -1};
    static boolean[][] visited;
    static int max_height = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        board = new int[N][N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                max_height = Math.max(board[i][j], max_height);
            }
        }

        for(int h=0; h<max_height; h++) {
            int count = 0;
            visited = new boolean[N][N];
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if(!visited[i][j] && board[i][j] > h) {
                        BFS(i, j, h);
                        count++;
                    }
                }
                max_area = Math.max(count, max_area);
            }
        }

        System.out.println(max_area);
    }
    public static void BFS(int srow, int scol, int height) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(srow, scol));
        visited[srow][scol] = true;

        while(!q.isEmpty()) {
            Node curr = q.remove();

            for(int i=0; i<4; i++) {
                int nr = curr.row + nrow[i];
                int nc = curr.col + ncol[i];

                if(nr<0 || nr>=board.length || nc<0 || nc>=board[0].length) {
                    continue;
                }
                if(visited[nr][nc] || board[nr][nc] <= height) {
                    continue;
                }
                visited[nr][nc] = true;
                q.add(new Node(nr, nc));

            }
        }


    }
    public static class Node {
        int row;
        int col;
        public Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}