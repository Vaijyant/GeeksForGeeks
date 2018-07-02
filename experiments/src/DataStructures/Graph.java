package DataStructures;

import java.util.LinkedList;

public class Graph {
    private int v; //No. of verticies
    private LinkedList<Integer> adj[];

    public Graph(int v) {

        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }
}
