import java.util.*;
import java.io.*;

public class Main {
    static int M;
    static int N;
    static int K;
    static int[][] board;
    static boolean[][] visited;
    static int count = 0;
    static int[] nrow = {1, 0, -1, 0};
    static int[] ncol = {0, 1, 0, -1};
    static int[] areas;
    static class Node {
        int row;
        int col;
        public Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); //x
        N = Integer.parseInt(st.nextToken()); //y
        K = Integer.parseInt(st.nextToken());

        board = new int[M][N];
        visited = new boolean[M][N];

        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int y=y1; y<y2; y++) {
                for(int x=x1; x<x2; x++) {
                    // 직사각형 범위에 해당하는 애들이 1, 나머지가 0
                    board[y][x] = 1;
                }
            }
        }

        BFS(0, 0);
        Arrays.sort(areas);
        System.out.println(count);
        for(int i : areas) {
            if(i==0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    static void BFS(int srow, int scol) {
        Queue<Node> q = new LinkedList<>();
        areas = new int[N*N];

        for(int i=srow; i<M; i++) {
            for(int j=scol; j<N; j++) {
                if(board[i][j] == 1 || visited[i][j]) {
                    // 갈 수 있는 길이 1이고 아니면 0일떄는 ==0이 맞지만 현재는 반대이므로 ==1
                    continue;
                }
                count++;
                visited[i][j] = true;
                q.add(new Node(i, j));

                int area = 0;

                while(!q.isEmpty()) {
                    area++;
                    areas[count] = area;
                    Node curr = q.remove();

                    for(int k=0; k<4; k++) {
                        int nr = curr.row + nrow[k];
                        int nc = curr.col + ncol[k];

                        if (nr < 0 || nr >= board.length || nc < 0 || nc >= board[0].length) {
                            continue;
                        }
                        if(visited[nr][nc] || board[nr][nc]!=0) {
                            //방문했거나 못가는길
                            //갈 수 있는 길이 1이고 못가는 길이 0일때는 !=1이 맞음 현재는 반대
                            continue;
                        }
                        visited[nr][nc] = true;
                        q.add(new Node(nr, nc));
                    }
                }
            }
        }
    }
}