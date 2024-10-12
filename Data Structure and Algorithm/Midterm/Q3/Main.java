public class Main {
    public static void main(String[] args) {
        
    }

    static LinkedList<Integer> change (int [] a, int i){
        // declare the linkedlist
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        // add the element of array to the linkedlist
        for (int v : a) {
            list.add(v);
        }

        //check whether the value before marker index
        //not less than the value in index i
        //if it happens, change the value with random integer less than
        //the value in index i

        for (int j = 0; j < i; j++){
            if (list.get(j) >=  list.get(i)){
                list.set(j,  (int) Math.random()*list.get(i));
            }
        }

        // print the value in the linkedlist and return the list
        for (int v : list){
            System.out.println(v + " ");
        }
    }
}
