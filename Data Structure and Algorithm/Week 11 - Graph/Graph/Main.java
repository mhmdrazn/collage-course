package Graph;
public class Main {

    public static void main(String[] args) {
        String[] label = {"A", "B", "C", "D"};
        Graph g = new Graph(4, label);
        
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);

        System.out.println(g);
    }
}
