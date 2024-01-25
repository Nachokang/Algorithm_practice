import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] board;
    static boolean[][] visited;
    static int[] houses;
    static int apart;
    static int[] nrow = {1, 0, -1, 0};
    static int[] ncol = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        board = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            for(int j=0; j<N; j++) {
                board[i][j] = s.charAt(j) - '0';
            }
        }

        BFS(0, 0);
        Arrays.sort(houses);
        System.out.println(apart);

        for(int i = 0; i<houses.length; i++) {
            if(houses[i] == 0) {

            }
            else {
                System.out.println(houses[i]);
            }
        }


    }

    static void BFS(int srow, int scol) {
        Queue<Node> q = new LinkedList<>();
        houses = new int[N*N];

        for(int i=srow; i<N; i++) {
            for(int j=scol; j<N; j++) {
                if(board[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                apart++;
                visited[i][j] = true;
                q.add(new Node(i, j));
                int houseNum = 0;

                while(!q.isEmpty()) {
                    houseNum++;
                    houses[apart] = houseNum;
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
            }
        }
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