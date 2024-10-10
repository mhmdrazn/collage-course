package Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> studMark1 = new HashMap<String, Double>();
        Map<String, Double> studMark2 = new TreeMap<String, Double>();
        
        String [] names = {"A", "B", "C", "D", "E", "F"};
        Double [] marks = {86.43, 98.22, 84.64, 92.76, 85.89, 76.32};
    
        for (int i = 0; i < names.length; i++){
            studMark1.put(names[i], marks[i]);
            studMark2.put(names[i], marks[i]);
        }

        System.out.println(studMark1.get("A"));
        System.out.println(studMark2.get("D"));

        System.out.println(studMark1.keySet());
        System.out.println(studMark2.keySet());
    }
}
