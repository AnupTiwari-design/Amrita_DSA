package graph;

public class Graph {

   int V;
    int[][] adj;

    public Graph(int v) {
        V = v;
        adj = new int[V][V];
    }

     public void addEdge(int u, int v) {
        adj[u][v] = 1;
        adj[v][u] = 1; //remove this line when you use directed graph

    }

     public void printGraph() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
       public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.printGraph();
    }
}


}
