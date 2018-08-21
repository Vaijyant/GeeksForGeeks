package Algorithms.Searching;

import DataStructures.Graph;

public class DFS {

    public static void dfs(Graph graph, int start) {

    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 3);

        int start = 2;
        System.out.println("Breadth First Traversal (starting from vertex " + start + ")");


        dfs(graph, start);

    }
}