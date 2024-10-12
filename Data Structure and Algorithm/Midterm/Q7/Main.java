package Q7;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = "DFEBAE";
        visitedCities(a, b);
    }

    static void visitedCities(String a, String b){
        Set<Character> R1 = new TreeSet<>();
        Set<Character> R2 = new TreeSet<>();
        for(int i=0;i<a.length();i++) R1.add(a.charAt(i));
        for(int i=0;i<b.length();i++) R2.add(b.charAt(i));
        
        
    }
}
