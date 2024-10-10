package Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] data = {7, 1, 1, 2, 3, 4, 5, 5, 6};
        Set<Integer> h = new HashSet<Integer>();
        Set<Integer> t = new TreeSet<Integer>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        for (int i: data) {
            h.add(i);
            t.add(i);
            l.add(i); 
        }

        for (int a:h){
            System.out.print(a + " ");
        }
        
        System.out.println();

        for (int b:t){
            System.out.print(b + " ");
        }

        System.out.println();

        for (int c:l){
            System.out.print(c + " ");
        }
    }
}