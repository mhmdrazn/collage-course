package Dijkstra;

import java.util.*;

public class Node {
    String id;
    Node previous = null;
    int totalDistance;
    ArrayList<Edge> edges = new ArrayList<>();

    public Node(String id){     
        this.id = id;
        this.totalDistance = Integer.MAX_VALUE;
    }

    public void addEdge(Node node, int weight){
        edges.add(new Edge(node, weight));
    }
}
 
class Edge{
    Node target;
    int weight;
 
    public Edge(Node terget, int weight){
        this.target = target;
        this.weight = weight;
    }
}
