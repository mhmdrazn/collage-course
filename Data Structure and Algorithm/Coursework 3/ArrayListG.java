/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 03
 * Student ID   : 5026231174 
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

 public class ArrayListG<T>{
    private T [] array;
    private int length; //length of array
    private int size; //number of content
    
    @SuppressWarnings("unchecked")
    public ArrayListG (int length){
        this.length=length;
        array = (T[]) new Object [this.length];
        this.size = 0;
    }
    
    public void addFront(T data){
        addAtIndex(0, data);
    }
    
    public void addBack(T data){
        addAtIndex(this.size, data);
    }
    
    @SuppressWarnings("unchecked")
    public void addAtIndex(int index, T data){
        if(this.length==this.size){
            this.length = this.length*2;
            
            T [] b = (T[]) new Object [this.length];
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
    
    public T removeFront(){
        return removeFromIndex(0);
    }
    
    public T removeBack(){
        return removeFromIndex(this.size-1);
    }   
    
    public T removeFromIndex(int index){
        T temp = this.array[index];
        for (int i = index + 1; i < this.size; i++){
            this.array[i-1] = this.array[i];
        }

        // this.array[this.size-1];
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