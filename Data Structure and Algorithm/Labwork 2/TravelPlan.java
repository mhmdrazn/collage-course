import java.util.*;

public class TravelPlan {

    public void cheapestRoute(int[][] graphMatrix, String[] label, int start){
        LinkedList<Integer> visited = new LinkedList<>();
        PriorityQueue<Integer> waiting = new PriorityQueue<>();
        
        int size = graphMatrix.length;
        int[] distance = new int[size];
        int[] previous = new int[size];

        // Set distance ke max value dan distance untuk node start = 0
        for (int j = 0; j < size; j++){
            distance[j] = Integer.MAX_VALUE;
            previous[j] = -1;
        }

        // set distance start ke 0
        distance[start] = 0;

        // tambahkan start ke waiting
        waiting.add(start);

        while (!waiting.isEmpty()){
            int currentNode = waiting.poll();
            if (visited.contains(currentNode)) continue;
            
            visited.add(currentNode);

            // iterasi untuk setiap node yang memiliki edge dengan currentNode
            for (int adjacency = 0; adjacency < graphMatrix[currentNode].length; adjacency++){
                if (graphMatrix[currentNode][adjacency] != Integer.MAX_VALUE && distance[currentNode] != Integer.MAX_VALUE && !visited.contains(adjacency)){
                    int lengthDistance = distance[currentNode] + graphMatrix[currentNode][adjacency];
                    
                    // update jarak node yang baru dan update waiting dan previous
                    if (lengthDistance < distance[adjacency]){
                        distance[adjacency] = lengthDistance;
                        waiting.add(adjacency);
                        previous[adjacency] = currentNode;  
                    }
                }
            }
        }

        // print setiap node dengan adjacencynya
        for (int i = 0; i < size; i++) {
            if (i != start) {
                System.out.println("Path: " + getPath(start, i, previous, label));
                System.out.println("Cost: " + distance[i]);
            } else {
                System.out.println("Path: " + label[start]);
                System.out.println("Cost: " + distance[i]);
            }
            System.out.println();
        }
    }

    // method untuk mendapatkan path dari node start ke node destination
    public  String getPath(int start, int destination, int[] previous, String[] label) {
        List<String> path = new ArrayList<>();
        int node = destination;

        /// loop untuk mendapatkan path dari node start ke node destination
        while (previous[node] != -1) {
            path.add(0, label[node]);
            node = previous[node];
        }

        // tambahkan node start ke path
        path.add(0, label[start]);
        return String.join(" -> ", path);
    }
}
