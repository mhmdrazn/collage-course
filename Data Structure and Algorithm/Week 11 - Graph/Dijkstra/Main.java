package Dijkstra;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        Node h = new Node("h");
        Node i = new Node("i");

        a.addEdge(b, 3);
        a.addEdge(d, 7);
        
        b.addEdge(a, 3);
        b.addEdge(c, 6);
        b.addEdge(d, 1);

        c.addEdge(a, 7);
        c.addEdge(b, 6);
        c.addEdge(d, 1);
        c.addEdge(f, 4);
        c.addEdge(e, 2);

        d.addEdge(b, 3);
        d.addEdge(c, 1);
        d.addEdge(f, 5);

        e.addEdge(c, 6);
        e.addEdge(f, 2);
        e.addEdge(g, 5);

        f.addEdge(d, 5);
        f.addEdge(c, 4);
        f.addEdge(e, 2);
        f.addEdge(g, 2);
        f.addEdge(i, 10);
        f.addEdge(h, 3);

        g.addEdge(e, 5);
        g.addEdge(f, 2);
        g.addEdge(i, 2);

        h.addEdge(f, 3);
        h.addEdge(i, 3);

        i.addEdge(g, 2);
        i.addEdge(f, 10);
        i.addEdge(h, 3);
    }

    public static void dijkstra(Node source){
        ArrayList<Node> unvisited = new ArrayList<>();
        source.totalDistance = 0;
        unvisited.add(source);

        while(!unvisited.isEmpty()){
            
        }
    }

    public void getMinDistance(ArrayList<Node> nodes){
        Node minNode = null;
        int getMinDistance = Integer.MAX_VALUE;

        for (Node node:nodes){
            
        }
    }
}
