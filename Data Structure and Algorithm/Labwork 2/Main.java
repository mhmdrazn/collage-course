import java.util.*;

public class Main {
    public static void main(String[] args) {
        // task1();
        // task2();
        optionalTask();
    }
    
    public static void task1(){
        // Section 4: 5 mennit
         //read file input        
            Scanner sc = new Scanner(Main.class.getResourceAsStream("deliveryboy.txt"));

            // Input jumlah streets
            int N = sc.nextInt();

        // Section 5: 5 menit (maks. 10 menit)
            // Input matriks jarak antarjalan NxN
            int[][] T = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    T[i][j] = sc.nextInt();
                }
            }

            // Input jumlah skenario
            int M = sc.nextInt();

            // Proses semua skenario
            for (int i = 0; i < M; i++) {
                int S = sc.nextInt(); // Restoran
                int G = sc.nextInt(); // Gas station
                int D = sc.nextInt(); // Destination

                // Simpan semua jarak dari jalan S
                int[] distanceS = Delivery.djikstra(T, S);
                // hotung jarak restoran -> gas station
                int distSG = distanceS[G];
                //hitung jarak gas station -> destination
                int distGD = Delivery.djikstra(T, G)[D];
                //hitung jarak original = S -> G -> D
                int jarakOriginal = distSG + distGD;

                // Hitung jarak optimal = S -> D
                int jarakOptimal = distanceS[D];

                // Output hasil
                System.out.println(jarakOriginal + " " + (jarakOriginal - jarakOptimal));
            }

            sc.close();
    }

    public static void task2(){
        String [] label = {"A", "B", "C", "D", "E", "F", "G"};
        // Create the graph using the Graph class
        Graph adjacencyGraph = new Graph(7);
        adjacencyGraph.addEdge(0, 1, 10); // A -> B (10)
        adjacencyGraph.addEdge(0, 2, 15); // A -> C (15)
        adjacencyGraph.addEdge(1, 5, 15); // B -> F (15)
        adjacencyGraph.addEdge(1, 3, 12); // B -> D (12)
        adjacencyGraph.addEdge(2, 4, 10); // C -> E (10)
        adjacencyGraph.addEdge(3, 5, 1); // D -> F (1)
        adjacencyGraph.addEdge(3, 6, 18); // D -> G (18)
        adjacencyGraph.addEdge(3, 4, 2); // D -> E (2)
        adjacencyGraph.addEdge(4, 6, 5); // E -> G (5)
        adjacencyGraph.addEdge(4, 5, 5); // E -> F (5)
        adjacencyGraph.addEdge(5, 6, 7); // F -> G (7)

        // Call the cheapestRoute method from TravelPlan Class
        TravelPlan travelPlan = new TravelPlan();
        travelPlan.cheapestRoute(adjacencyGraph.getGraphMatrix(), label, 0);
    }
    public static void optionalTask(){
        // Create the graph using WightedGraphAL class
        WeightedGraphAL graph = new WeightedGraphAL();
        graph.addEdge("A", "B", 10);
        graph.addEdge("A", "C", 2);
        graph.addEdge("A", "D", 8);
        graph.addEdge("B", "E", 8);
        graph.addEdge("B", "G", 10);
        graph.addEdge("C", "D", 5);
        graph.addEdge("C", "F", 8);
        graph.addEdge("D", "G", 7);
        graph.addEdge("E", "H", 7);
        graph.addEdge("F", "I", 10);
        graph.addEdge("G", "H", 10);
        graph.addEdge("G", "I", 3);
        graph.addEdge("H", "I", 5);

        // System.out.println("Weighted Graph Adjacency List:");
        // Print the graph
        graph.djikstra("A", "H");
        // System.out.println(graph);
        
        // Call the dijkstra method from graph
    }

}
