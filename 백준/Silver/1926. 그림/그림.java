import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] board;
    static boolean[][] visited;
    static int[] nrow = {1, 0, -1, 0};
    static int[] ncol = {0, 1, 0, -1};
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int number = 0;
        Queue<Node> q = new LinkedList<>();

        for(int i = 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(board[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                number++;
                visited[i][j] = true;
                q.add(new Node(i, j));
                int area = 0;

                while(!q.isEmpty()) {
                    area++;
                    Node curr = q.remove();

                    for(int k=0; k<4; k++) {
                        int nr = curr.row + nrow[k];
                        int nc = curr.col + ncol[k];

                        if(nr<0 || nr>=board.length || nc<0 || nc>=board[0].length) {
                            continue;
                        }
                        if(visited[nr][nc] || board[nr][nc] != 1) {
                            continue;
                        }

                        visited[nr][nc] = true;
                        q.add(new Node(nr, nc));
                    }
                }
                if(area > max) {
                    max = area;
                }
            }
        }

        System.out.println(number);
        System.out.println(max);
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