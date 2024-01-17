import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[][] board;
    static boolean[][] visited;
    static int[] nrow = {1, 0, -1, 0};
    static int[] ncol = {0, 1, 0, -1};

    static class Node {
        int row;
        int col;
        int dist;

        public Node(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i<N; i++) {
            String line = br.readLine();
            for(int j = 0; j<M; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }

        Queue<Node> q = new LinkedList<>();

        visited[0][0] = true;
        q.add(new Node(0, 0, 1));

        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr.row == board.length-1 && curr.col == board[0].length-1) {
                System.out.println(curr.dist);
            }

            for(int i = 0; i<4; i++) {
                int nr = curr.row + nrow[i];
                int nc = curr.col + ncol[i];
                if(nr<0 || nr>=board.length || nc<0 || nc>=board[0].length) {
                    continue;
                }

                if(visited[nr][nc] || board[nr][nc] != 1) {
                    continue;
                }

                visited[nr][nc] = true;
                q.add(new Node(nr, nc, curr.dist+1));
            }
        }
    }
}