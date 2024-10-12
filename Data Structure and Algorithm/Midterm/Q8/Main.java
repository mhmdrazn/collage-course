package Q8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String V = "ABCDDDEEEEEEEEEEEDDEEE";
        countVote(V);
    }

    static void countVote(String V){
        Map<Character, Integer> count =  new HashMap<Character, Integer>();
        
        for (int i = 0; i < V.length(); i++){
            char c = V.charAt(i);
            // bikin conditional, apabila char nya udah ada di map --> tambahin value nya
            // kalo char nya belom ada di map --> set value ke 1
            
            if (count.containsKey(c)){
                int value = count.get(c); // tangkep value nya
                count.put(c, value + 1); // put key dan tambahkan valuenya
            } else {
                count.put(c, 1); // put char dan set valuenya menjadi 1
            }
        }
        
        // kita bikin set untuk menyimpan char
        Set<Character> set = new HashSet<>();
        set = count.keySet(); // masukin key ke dalam set
        
        char winner = '0';
        int maxVote = 0;
        
        for(Character c:set){ // iterasi untuk setiap key yang ada di set 
            int value = count.get(c); // kita ambil value dari setiap key
            if (value > maxVote){ // cek, kalo valuenya lebih dari maxvote
                winner = c; // set winner
                maxVote = value; // set maxVote ke value
            }
        }
        
        System.out.print(winner + " " + maxVote);
    }
}
