
package Algorithms.Searching;

import DataStructures.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    public static void bfs(Graph graph, int vertex) {

        int size = graph.getVertexCount();
        LinkedList<Integer> adj[] = graph.getAdjMatrix();

        boolean visited[] = new boolean[size]; // set as false
        LinkedList<Integer> queue = new LinkedList<Integer>(); // Create a queue for BFS

        // Mark the current node as visited and enqueue it
        visited[vertex] = true;
        queue.add(vertex);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            vertex = queue.poll();
            System.out.print(vertex + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[vertex].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1); graph.addEdge(1, 0);
        graph.addEdge(0, 2); graph.addEdge(2, 0);
        graph.addEdge(1, 2); graph.addEdge(2, 1);
        graph.addEdge(2, 3); graph.addEdge(3, 2);
        graph.addEdge(3, 3);

        int start = 2;
        System.out.println("Breadth First Traversal (starting from vertex " + start + ")");


        bfs(graph, start);

    }
}
