package XCrackingTheCodingInterview.Chapter04;

import java.util.LinkedList;

/**
 * route between nodes
 */

enum State {
    Unvisited, Visited, Visiting;
}

class Node {
    State state;
    Node[] adjacent;

    Node[] getAdjacent() {
        return adjacent;
    }
}

class Graph {
    Node[] nodes;

    Node[] getNodes() {
        return nodes;
    }
}

public class Problem01 {
    boolean search(Graph g, Node start, Node end) {
        if (start == end)
            return true;

        LinkedList<Node> q = new LinkedList<>();

        for (Node u : g.getNodes()) {
            u.state = State.Unvisited;
        }

        start.state = State.Visiting;
        q.add(start);
        Node u;

        while (!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null) {
                for (Node v : u.getAdjacent()) {
                    if (v.state == State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
