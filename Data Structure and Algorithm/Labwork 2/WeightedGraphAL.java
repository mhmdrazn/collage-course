import java.util.*;

public class WeightedGraphAL {
    private Map<String, List<Edge>> adjacencyList;

    public WeightedGraphAL() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(String node1, String node2, int weight){   
        // cek apakah node1 dan node2 sudah ada di graph, jika belum tambahkan
        if (!adjacencyList.containsKey(node1)){
            adjacencyList.put(node1, new ArrayList<>());
        } 
        if (!adjacencyList.containsKey(node2)){
            adjacencyList.put(node2, new ArrayList<>());
        }

        // tambahkan edge dari node1 ke node2 dan sebaliknya
        adjacencyList.get(node1).add(new Edge(node2, weight));
        adjacencyList.get(node2).add(new Edge(node1, weight));
    }

    @Override
    public String toString() {
        // buat string dengan format adjacency list
        StringBuilder builder = new StringBuilder("Weighted Graph Adjacency List:\n");
        for (String node : adjacencyList.keySet()) {
            // ambil setiap keyset pada adjacencyList
            builder.append(node).append(" --> ");
            List<Edge> edges = adjacencyList.get(node);
            for (Edge edge : edges) {
                builder.append(edge.getTargetNode()).append("(").append(edge.getWeight()).append(") ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public void djikstra(String start, String end){
        PriorityQueue<Node> waitList = new PriorityQueue<>(Comparator.comparingInt(Node::getDistance));
        Map<String, Integer> distance = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        Set<Node> visited = new HashSet<>();

        // inisialisasi jarak semua node dengan nilai max
        for (String node: adjacencyList.keySet()){
            distance.put(node, Integer.MAX_VALUE);
        }

        // set jarak node pertama ke 0
        distance.put(start, 0);

        // masukkan node pertama ke waitlist
        waitList.add(new Node(start, 0));

        while(!waitList.isEmpty()){
            // ambil urutan pertama pada waitList queue
            Node currentNode = waitList.poll();
            String current = currentNode.getNode();

            // cek apakah node sudah dikunjungi atau tidak
            if (visited.contains(currentNode)) continue;

            // tambahkan node ke visited
            visited.add(currentNode);

            // cek neighbor node dari node saat ini dan ambil jaraknya
            for (Edge neighbor: adjacencyList.get(current)){
                String neighborNode = neighbor.getTargetNode();
                int newDistance = distance.get(current) + neighbor.getWeight();

                // update jarak node yang baru
                if (newDistance < distance.get(neighborNode)){
                    distance.put(neighborNode, newDistance);
                    previous.put(neighborNode, current);
                    waitList.add(new Node(neighbor.getTargetNode(), newDistance));
                    visited.add(currentNode);
                }
            }
        }

        // print setiap node dengan adjacencynya 
        System.out.println(this);

        // panggil method printPath 
        printPath(start, end, distance, previous);
        
    }

    private void printPath(String start, String end, Map<String, Integer> distance, Map<String, String> previous) {
        // cek apakah node ada di graph, jika tidak return
        if (!distance.containsKey(end) || distance.get(end) == Integer.MAX_VALUE) {
            System.out.println("No path exists from " + start + " to " + end);
            return;
        }

        // buat linked list untuk menampung path
        LinkedList<String> path = new LinkedList<>();
        // tambahkan node ke linked list path
        for (String position = end; position != null; position = previous.get(position)) {
            path.addFirst(position);
        }

        System.out.println("Path: " + String.join(" --> ", path));
        System.out.println("Shortest distance from " + start + " to " + end + " = " + distance.get(end));
    }
}
