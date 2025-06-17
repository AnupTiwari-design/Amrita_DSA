from collections import deque

class Graph:
    def __init__(self, vertices):
        self.V = vertices
        self.adj = {i: [] for i in range(vertices)}

    def add_edge(self, u, v):
        self.adj[u].append(v)
        self.adj[v].append(u)  # Remove this for directed graph

    def bfs(self, start):
        visited = [False] * self.V
        queue = deque([start])
        visited[start] = True

        while queue:
            node = queue.popleft()
            print(node, end=' ')
            for neighbor in self.adj[node]:
                if not visited[neighbor]:
                    visited[neighbor] = True
                    queue.append(neighbor)

    def dfs(self, start):
        visited = [False] * self.V
        self._dfs_helper(start, visited)

    def _dfs_helper(self, node, visited):
        visited[node] = True
        print(node, end=' ')
        for neighbor in self.adj[node]:
            if not visited[neighbor]:
                self._dfs_helper(neighbor, visited)


# Example usage
g = Graph(5)
g.add_edge(0, 1)
g.add_edge(0, 2)
g.add_edge(1, 3)
g.add_edge(1, 4)

print("BFS from node 0:")
g.bfs(0)

print("\nDFS from node 0:")
g.dfs(0)