package Q7;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = "CDE";
        visitedCities(a, b);
    }

    static void visitedCities(String a, String b){
        Set<Character> R1 = new TreeSet<>();
        Set<Character> R2 = new TreeSet<>();
        for(int i=0;i<a.length();i++) R1.add(a.charAt(i));
        for(int i=0;i<b.length();i++) R2.add(b.charAt(i));
        
        // Cara 1
        Set<Character> Rtemp = new TreeSet<Character>();
        Rtemp.addAll(R1); // Ambil intersection dari R1 dan R2 pake retainAll
        R1.retainAll(R2);
        
        Rtemp.addAll(R2); // Gabungkan kota R1 dan R2 pake addAll
        Rtemp.removeAll(R1); // Hapus duplikasi R1 dan R2 pake removeAll
        System.out.println(Rtemp);


        // Cara 2
        Set<Character> V1 = new TreeSet<>();
        Set<Character> V2 = new TreeSet<>();

        V1.addAll(R1); 
        V2.addAll(R2);
        
        R1.removeAll(V2); // Ambil kota R1 yang tidak dikunjungi R2
        R2.removeAll(V1); // Ambil kota R2 yang tidak dikunjungi R1
    
        R1.addAll(R2); // Gabungkan keduanya

        System.out.println(R1);

    }
}
