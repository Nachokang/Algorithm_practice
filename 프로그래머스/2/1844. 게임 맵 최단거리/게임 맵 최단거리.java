import java.util.*;

class Solution {

    static boolean[][] visited;
    static int[] nrow = {1, 0, -1, 0};
    static int[] mcol = {0, 1, 0, -1};

    class Node {
        int row;
        int col;
        int dist;

        public Node(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;

        answer = bfs(0, 0, maps);

        return answer;
    }

    public int bfs(int srow, int scol, int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        Queue<Node> q = new LinkedList<>();

        visited[srow][scol] = true;
        q.add(new Node(srow, scol, 1));

        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr.row == maps.length-1 && curr.col == maps[0].length-1) {
                return curr.dist;
            }

            for(int i=0; i<4; i++) {
                int nr = curr.row + nrow[i];
                int nc = curr.col + mcol[i];
                if(nr < 0 || nr >= maps.length || nc < 0 || nc >= maps[0].length) {
                    continue;
                }
                if(visited[nr][nc] || maps[nr][nc] != 1) {
                    continue;
                }
                visited[nr][nc] = true;
                q.add(new Node(nr, nc, curr.dist+1));
            }
        }

        return -1;
    }
}