import java.util.*;

class EmployeeTree {
    Map<String, EmployeeNode> nodeMap;
    String rootName; // Keeps track of the root (CEO)

    public EmployeeTree() {
        nodeMap = new HashMap<>();
        rootName = null;
    }

    public void add(String name) {
        EmployeeNode employee = new EmployeeNode(name);
        nodeMap.put(name, employee);
        
        if (this.rootName == null){
            rootName = name;
        } 
    }

    public void setLeftChild(String parentName, String childName) {
        EmployeeNode parent = nodeMap.get(parentName);
        EmployeeNode child = new EmployeeNode(childName);
        
        nodeMap.put(childName, child);        
        parent.left = childName;
    }

    public void setRightChild(String parentName, String childName) {
        EmployeeNode parent = nodeMap.get(parentName);
        EmployeeNode child = new EmployeeNode(childName);
        
        nodeMap.put(childName, child);
        parent.right = childName;
    }

    public int findMaxDepth(String nodeName) {
        // base case: kalo nodeName = null, maka depth-nya 0
        if (nodeName == null) return 0;

        EmployeeNode node = nodeMap.get(nodeName);

        // recursive, cari depth dari subtree kiri dan kanan
        int leftDepth = findMaxDepth(node.left);
        int rightDepth = findMaxDepth(node.right);

        /// return depth maks dari subtree kiri dan kanan
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public void listEmployeesByLevel(){
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        queue.add(rootName);
        if (rootName == null) return;

        int level = 1;

        while(queue.isEmpty() == false){
            List<String> currentLevel = new ArrayList<>();
            int queueSize = queue.size();
            
            System.out.println("Level " + level + ": ");             
            
            for (int i = 0; i < queueSize; i++){
                String currentNode =  queue.poll();
                EmployeeNode node = nodeMap.get(currentNode);

                currentLevel.add(currentNode);
                
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                System.out.print(currentNode + " ");
                result.add(currentNode);
            }
            System.out.println();
            ++level;
        }
    }

    public boolean findEmployee(String nodeName, String name) {
        // return false kalo tidak ada employee dengan nama name
        if (nodeName == null) return false;

        // return true kalo terdapat employee dengan nama name
        EmployeeNode node = nodeMap.get(nodeName);       
        if (node.name.equals(name)) return true;
        
        // recursive, cari di subtree kiri dan kanan kalo tidak ditemukan di node sekarang
        boolean leftFound = findEmployee(node.left, name);
        boolean rightFound = findEmployee(node.right, name);
        return leftFound || rightFound;
    }
}