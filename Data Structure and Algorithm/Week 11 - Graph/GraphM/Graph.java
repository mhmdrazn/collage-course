package GraphM;

import java.util.*;

class GraphM {
    Map<String, ArrayList<String>> adjacencyList;

    GraphM() {
        this.adjacencyList = new TreeMap<String, ArrayList<String>>();
    }

    void addEdge(String node1, String node2) {
        ArrayList<String> neighbors1 = adjacencyList.get(node1);
        if (neighbors1 == null) { // Jika node1 belum memiliki daftar tetangga
            neighbors1 = new ArrayList<>();
            neighbors1.add(node2);
            adjacencyList.put(node1, neighbors1);
        } else { // Jika node1 sudah memiliki daftar tetangga
            neighbors1.add(node2);
        }

        // Tambahkan juga edge sebaliknya (graf tak berarah)
        ArrayList<String> neighbors2 = adjacencyList.get(node2);
        if (neighbors2 == null) {
            neighbors2 = new ArrayList<>();
            neighbors2.add(node1);
            adjacencyList.put(node2, neighbors2);
        } else {
            neighbors2.add(node1);
        }
    }

    void dfs(String startNode) {
        ArrayList<String> visitedNodes = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.empty()) {
            String currentNode = stack.pop();

            if (!visitedNodes.contains(currentNode)) {
                visitedNodes.add(currentNode);
                System.out.print(currentNode + " - ");
            }

            ArrayList<String> neighbors = adjacencyList.get(currentNode);
            if (neighbors != null) {
                Collections.sort(neighbors, Collections.reverseOrder()); // Sort secara descending

                for (String neighbor : neighbors) {
                    if (!visitedNodes.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    void bfs(String startNode) {
        ArrayList<String> visitedNodes = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();

            if (!visitedNodes.contains(currentNode)) {
                visitedNodes.add(currentNode);
                System.out.print(currentNode + " - ");
            }

            ArrayList<String> neighbors = adjacencyList.get(currentNode);
            if (neighbors != null) {
                Collections.sort(neighbors, Collections.reverseOrder()); // Sort secara descending

                for (String neighbor : neighbors) {
                    if (!visitedNodes.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public String toString() {
        String output = "";

        for (String node : adjacencyList.keySet()) {
            output += node + "-->";
            for (String neighbor : adjacencyList.get(node)) {
                output += neighbor + " ";
            }
            output += "\n";
        }

        return output;
    }
}
