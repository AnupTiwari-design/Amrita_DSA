class Graph:
    def __init__(self, vertices):
        self.V = vertices
        self.adj = {i: [] for i in range(vertices)}

    def add_edge(self, u, v):
        self.adj[u].append(v)
        self.adj[v].append(u)  # remove for directed graph

    def print_graph(self):
        for u in self.adj:
            print(f"{u} -> {self.adj[u]}")

# Example usage
g = Graph(4)
g.add_edge(0, 1)
g.add_edge(0, 2)
g.add_edge(1, 3)
g.print_graph()