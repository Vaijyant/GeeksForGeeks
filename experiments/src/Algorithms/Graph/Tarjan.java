package Algorithms.Graph;

import java.util.*;

public class Tarjan {

    public static void main(String[] args){
        Tarjan trajan = new Tarjan();

        List<List<Integer>> graph = new ArrayList<>();
        List<Integer> edge;
        edge = new ArrayList<>(); edge.add(0); edge.add(1); graph.add(edge);
        edge = new ArrayList<>(); edge.add(1); edge.add(2); graph.add(edge);
        edge = new ArrayList<>(); edge.add(2); edge.add(0); graph.add(edge);
        edge = new ArrayList<>(); edge.add(1); edge.add(3); graph.add(edge);
        edge = new ArrayList<>(); edge.add(3); edge.add(4); graph.add(edge);
        edge = new ArrayList<>(); edge.add(4); edge.add(5); graph.add(edge);
        edge = new ArrayList<>(); edge.add(5); edge.add(3); graph.add(edge);

       for(List<Integer> criticalEdge :  trajan.criticalConnections(6,graph)) {
           System.out.println(String.format("[%s, %s]", criticalEdge.get(0), criticalEdge.get(1)));
       }
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

        List<List<Integer>> criticalConnections = new ArrayList<>();
        Map<Integer, List<Integer>> serverMap = new HashMap<>();


        for (List<Integer> connection : connections) {
            serverMap.putIfAbsent(connection.get(0), new ArrayList<>());
            serverMap.putIfAbsent(connection.get(1), new ArrayList<>());
            serverMap.get(connection.get(0)).add(connection.get(1));
            serverMap.get(connection.get(1)).add(connection.get(0));
        }


        boolean[] visited = new boolean[n];
        int[] lowLinkValues = new int[n];
        int time = 0;

        for (int i = 0; i < n; i++) {
            dfs(i, i, visited, lowLinkValues, serverMap, time, criticalConnections);
        }

        return criticalConnections;
    }

    private void dfs(int currentVertice, int parentVertice, boolean[] visited, int[] lowLinkValues, Map<Integer, List<Integer>> map, int time, List<List<Integer>> criticalConnections) {


        time++;
        lowLinkValues[currentVertice] = time;
        int discoverdValue = time;
        visited[currentVertice] = true;

        display(currentVertice, parentVertice, visited, lowLinkValues, discoverdValue, time);

        for (int vertice : map.get(currentVertice)) {
            if (vertice == parentVertice) continue;
            if (!visited[vertice]) {
                dfs(vertice, currentVertice, visited, lowLinkValues, map, time, criticalConnections);
                if (discoverdValue < lowLinkValues[vertice]) {
                    criticalConnections.add(Arrays.asList(currentVertice, vertice));
                }
            }
            lowLinkValues[currentVertice] = Math.min(lowLinkValues[currentVertice], lowLinkValues[vertice]);
        }
    }

    private void display(int currentVertice, int parentVertice, boolean[] visited, int[] lowLinkValues, int discoverdValue, int time) {
        System.out.println();
        System.out.println();
        System.out.println("Current Vertice = " + currentVertice);
        System.out.println("Parent Vertice = " + parentVertice);
        System.out.println("Time Vertice = " + time);
        System.out.println("Discovered Value = " + discoverdValue);

        for(int i = 0; i<visited.length; i++) {
            System.out.print("visited[" + i + "] = " + visited[i] + "\t");
        }
        System.out.println();
        for(int i = 0; i<lowLinkValues.length; i++) {
            System.out.print("lowLinkValues[" + i + "] = " + lowLinkValues[i] + "\t");
        }
        System.out.println();

    }

}
