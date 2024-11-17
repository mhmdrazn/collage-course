package Tree;

public class Node {
    private String name;
    private Node left;
    private Node right;
    
    public Node(String n, Node l, Node r){
        this.name = n;
        this.left = l;
        this.right = r;
    };

    public String getName(){
        return this.name;
    };

    public Node getLeft(){
        return this.left;
    };

    public Node getRight(){
        return this.right;
    };
}
