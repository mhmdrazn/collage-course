package GraphM;
public class Main {

    public static void main(String[] args) {
        String[] label = {"A", "B", "C", "D"};
        GraphM g2 = new GraphM();
        
        g2.addEdge("A","B" );
        g2.addEdge("A","C" );
        g2.addEdge("B","D" );
        g2.addEdge("C","D" );

        g2.dfs("A");
        System.out.println("");
        g2.bfs("A");
        
        // System.out.println(g2);
    }
}
