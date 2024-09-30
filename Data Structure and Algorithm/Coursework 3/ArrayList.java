/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 03
 * Student ID   : 5026231174 
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

 public class ArrayList{
    private int [] array;
    private int length; //length of array
    private int size; //number of content
    
    public ArrayList(int length){
        this.length=length;
        array = new int[this.length];
    }
    
    public void addFront(int data){
        addAtIndex(0, data);
    }
    
    public void addBack(int data){
        addAtIndex(this.size, data);
    }
    
    public void addAtIndex(int index, int data){
        if(this.length==this.size){
            this.length = this.length*2;
            
            int [] b = new int[this.length];
            for(int i=0;i<index;i++){
                b[i] = this.array[i];
            }

            b[index]=data; 
            
            for(int i=index;i<size;i++){
                b[i+1] = this.array[i];
            }
            
            this.array=b;
            
            
        } else {
            for(int i=this.size;i>index;i--){
                array[i]=array[i-1];
            }
            array[index]=data;
        }
        this.size++;
    }
    
    public int removeFront(){
        removeFromIndex(0);
        return 0;
    }
    
    public int removeBack(){
        removeFromIndex(this.size-1);
        return 0;
    }
    
    public int removeFromIndex(int index){
        int temp = this.array[index];
        
        for (int i = index + 1; i < this.size; i++){
            this.array[i-1] = this.array[i];
        }

        this.array[this.size-1] = 0;
        this.size--;
        return temp;
    }
    
    public String toString(){
        String o="";
        for(int i=0;i<this.size;i++){
            o+=this.array[i]+ " ";
        }
        return o;
    }
    
    
    
}