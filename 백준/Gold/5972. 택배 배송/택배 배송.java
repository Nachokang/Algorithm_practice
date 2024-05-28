import java.util.*;
import java.io.*;

class Main {
    static int N, M;
    static int[] dist;
    static ArrayList<Edge>[] adj;
    static PriorityQueue<Edge> pq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dist = new int[N+1];
        adj = new ArrayList[N+1];
        for(int i=0; i<N+1; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); //from
            int B = Integer.parseInt(st.nextToken()); //to
            int C = Integer.parseInt(st.nextToken()); //weight

            adj[A].add(new Edge(B, C));
            adj[B].add(new Edge(A, C));
        }

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;


        pq = new PriorityQueue<>();
        pq.add(new Edge(1, 0));

        while(!pq.isEmpty()) {
            Edge curr = pq.remove();

            for(int i=0; i<adj[curr.node].size(); i++) {
                Edge next = adj[curr.node].get(i);

                if(dist[next.node] > dist[curr.node] + next.weight) {
                    dist[next.node] = dist[curr.node] + next.weight;
                    pq.add(new Edge(next.node, dist[next.node]));
                }
            }
        }

        System.out.println(dist[N]);
    }

    static class Edge implements Comparable<Edge> {
        int node;
        int weight;
        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }

        public Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
}