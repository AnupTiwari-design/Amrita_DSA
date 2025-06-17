package graph;

import java.util.*; 

public class BFs_Dfs {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    // Constructor
    public BFs_Dfs(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Remove this line for directed graph
    }

    // BFS traversal
    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // DFS traversal
    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        dfsHelper(start, visited);
    }

    private void dfsHelper(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        BFs_Dfs g = new BFs_Dfs(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        System.out.println("BFS from node 0:");
        g.bfs(0);

        System.out.println("\nDFS from node 0:");
        g.dfs(0);
    }
}