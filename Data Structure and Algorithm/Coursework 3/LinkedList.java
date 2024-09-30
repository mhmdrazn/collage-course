/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 03
 * Student ID   : 5026231174 
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

 public class LinkedList{
    private Node head;
    private int size;
    
    public LinkedList(){
        this.size=0;
    }
    
    public void addFront(int data){
        if (this.size==0){
            this.head = new Node(data,null);
        } else{
            Node newHead = new Node(data,this.head);
            this.head = newHead; 
        }
        this.size++;
    }
    
    public void addBack(int data){
        if (this.size==0){
            this.head = new Node(data,null);
        } else{
            Node curr= this.head;
            while(curr.link!=null){
                curr=curr.link;
            }
            curr.link = new Node(data,null);
        }
        this.size++;
    }
    
    public void addAtIndex(int index, int data){
        if (index==0){
            addFront(data);
        } 
        else if(index==size){
            addBack(data);
        }
        
        else{
            Node curr=this.head;
            for(int i=0;i<index-1;i++){
                curr=curr.link;
            }
            Node newNode = new Node(data,curr.link);
            curr.link=newNode;
        }
        this.size++;
    }
    
    public int removeFromIndex(int index){
        if (index == 0){
            removeFront();
        } else if (index == size-1){
            removeBack();
        } else {
            Node curr = this.head;
            // its mean that the index is not the first or last
            // so we need to find the node before the index and remove the next node from it
            for(int i=0;i<index-1;i++){
                curr=curr.link; // this line means that curr is the node before the index
                // the we need to remove the next node from it
                // so we just need to change the link of the node before the index to the node after the index
            }
            curr.link = curr.link.link;
            // we change the link of the node before the index to the node after the index
        }
        this.size--;
        return 0;
    }
    
    public int removeFront(){
        int temp = head.value;
        head = head.link;
        this.size--;
        return temp;
    }
    
    public int removeBack(){
        if (this.size==1){
            removeFront();
        } else {
            Node curr = this.head;
            while(curr.link.link!=null){
                curr=curr.link;
            }
            int temp = curr.link.value;
            curr.link = null;
        }
        return 0;
    }
    
    public String toString(){
        String o="";
        Node n = this.head;
        do {
            o+= n.value+" ";
            n= n.link;
        }while(n!=null);
        return o;
    }
}