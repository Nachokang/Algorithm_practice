import java.util.*;
import java.io.*;

class Main {
    static int V,E,K;
    static int[] dist;
    static ArrayList<Edge>[] adj;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());

        dist = new int[V+1];
        adj = new ArrayList[V+1];
        for(int i=0; i<V+1; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            adj[from].add(new Edge(to, weight));
        }

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[K] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(K, 0));

        while(!pq.isEmpty()) {
            Edge curr = pq.remove();

            if(dist[curr.node] < curr.weight) {
                continue;
            }

            for(int i=0; i<adj[curr.node].size(); i++) {
                Edge next = adj[curr.node].get(i);

                if(dist[next.node] > dist[curr.node] + next.weight) {
                    dist[next.node] = dist[curr.node] + next.weight;
                    pq.add(new Edge(next.node, dist[next.node]));
                }
            }
        }

        for(int i=1; i<V+1; i++) {
            if(dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            }
            else {
                System.out.println(dist[i]);
            }
        }

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