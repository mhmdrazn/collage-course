package PrimsAlgorithm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String [] l2 ={"A","B","C","D","E","F","G","H","I"};
        Graph g3 = new Graph(9, l2);
        
        g3.addEdge(0,1,10); //e1
        g3.addEdge(0,3,5); //e2
        g3.addEdge(0,2,2); //e3
        g3.addEdge(0,4,8); //e4
        
        g3.addEdge(2,3,3); //e5
        g3.addEdge(1,3,4); //e6
        g3.addEdge(2,4,3); //e7
        g3.addEdge(2,5,8); //e8
        
        g3.addEdge(3,5,10); //e9
        g3.addEdge(3,7,15); //e10
        g3.addEdge(5,7,3); //e11
        g3.addEdge(4,5,9); //e12
        
        g3.addEdge(4,8,4); //e13
        g3.addEdge(4,6,6); //e14
        g3.addEdge(6,8,1); //e15
        g3.addEdge(6,7,5); //e16
        
        System.out.println();
        System.out.println("Part 7: Prim' Algorithm:");
        g3.primAlg();
        
    }
}
