/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 04
 * Student ID   : 5026231174 
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

 import java.util.*;

 public class Main {
 
     public static void main(String[] args) {
        System.out.println("Problem Test Case 1:");
        Integer [] a = {1, 3, 1, 4, 3, 7, -2, 0, 7, -2, -2, 1};
        ArrayList<Integer> v = new ArrayList<Integer> (Arrays.asList(a));
        System.out.println(twice(v));
        
        System.out.println("Problem Test Case 2:");
        String [] fNames ={"Marty", "Stuart", "Jessica", "Amanda", "Meghan", "Hal"};
        String [] lNames ={"Stepp", "Reges", "Miller", "Camp", "Miller", "Perkins"};
        String [] lNamesX ={"Stepp", "Reges", "Muller", "Camp", "Miller", "Perkins"};
        
        TreeMap<String, String> m1 = new TreeMap<String, String>();
        for(int i=0;i<fNames.length;i++){
            m1.put(fNames[i],lNames[i]);
        }
        
        TreeMap<String, String> m2 = new TreeMap<String, String>();
        for(int i=0;i<fNames.length;i++){
            m2.put(fNames[i],lNamesX[i]);
        }
        
        System.out.println(hasDuplicateValue(m1));
        System.out.println(hasDuplicateValue(m2));
        
        System.out.println("Problem Test Case 3:");
        Integer d1 [] = {3, 8, 17, 9, 17, 8, 3};
        Integer d2 [] = {3, 8, 17, 9, 4, 17, 8, 3};
        
        Queue<Integer> q1 = new LinkedList<Integer> (Arrays.asList(d1));
        Queue<Integer> q2 = new LinkedList<Integer> (Arrays.asList(d2));
        
        System.out.println(isPalindrome(q1));
        System.out.println(isPalindrome(q2));
     }
     
     public static Set<Integer> twice(List<Integer> l){
        Set<Integer> s = new TreeSet<Integer>(); // Set untuk menyimpan value unik dari list
        Set<Integer> s2 = new TreeSet<Integer>(); // Set untuk menympan integer yang muncul lebih dari satu kali
        
        for (Integer num : l){
            // Jika angka dalam list tidak ada di set S, maka angka tersebut akan ditambahkan ke set S
            if (!s.contains(num)){
                s.add(num);
            } else {
                // Jika angka sudah ada di set S, maka angka tersebut akan ditambahkan ke set S2
                s2.add(num);
            }
        }

        Set<Integer> s3 = new TreeSet<Integer>(); // Set untuk menyimpan nilai yang muncul dua kali
        // Cek apakah angka muncul tepat 2 kali
        for (Integer num : s2){
            if (Collections.frequency(l, num) == 2){
                s3.add(num); // Tambahkan value yang muncul 2 kali ke dalam set S3
            }
        }

        // Panggil S3 untuk memunculkan nilai yang muncul dua kali
        return s3;
     }
     
     public static boolean hasDuplicateValue(Map<String,String> m){
        boolean s = false;
        Set<String> seenValue = new HashSet<String>(); // Set untuk menyimpan nilai yang sudah dilihat

        // Loops untuk mencari apakah terdapat value dari m yang berulang
        for (String value : m.values()){
            if (!seenValue.add(value)){
                // Jika value sudah ada di set seenValue, maka nilai tersebut duplikat
                return true;
            }
        }

        return s;
     }
     
     public static boolean isPalindrome(Queue<Integer> q){
        boolean s = true;
        Stack<Integer> stack = new Stack<Integer>(); // Stack untuk menyimpan nilai dari queue

        // Cek apakah queue kosong, queue kosong dikategorikan sebagai palindrome
        if (q.isEmpty()){
            return true;
        }

        // Queue ukuran ganjil
        if (q.size() % 2 == 1){ // Jika ukuran queue ganjil, maka nilai tengah tidak perlu dibandingkan
            int size = q.size()/2 + 1; // untuk kasus ganjil, tambahkan 1 untuk nilai tengah
            for (int i = 0; i < size; i++){
                stack.push(q.poll()); // masukkan setengah value queue ke dalam stack (beserta nilai tengah)
            }
            stack.pop(); // Hapus nilai tengah untuk queue yang berukuran ganjil
        } 
        //Queue ukuran genap
        else if (q.size() % 2 == 0){  // Jika ukuran queue genap, maka nilai tengah perlu dibandingkan
            int size = q.size()/2;
            for (int i = 0; i < size; i++){
                stack.push(q.poll()); // Masukkan setengah value queue ke dalam stack
            }
        }

        while (!stack.isEmpty() && !q.isEmpty()){ // Bandingkan nilai dari queue dan stack
            if (q.poll() != stack.pop()){ // Jika nilai dari queue dan stack tidak sama, maka bukan palindrome
                return false;
            }
        }

        // Jika semua nilai sudah dibandingkan, maka queue merupakan palindrome
        return s;
     }
 }
  