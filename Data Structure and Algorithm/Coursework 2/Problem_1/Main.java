package Problem_1;

/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 02
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

 public class Main {

    public static void main(String[] args) {
      Dog loli = new Dog("loli");
      Cat lola = new Cat("lola");
      //Cat anjing = new BigDog("anjing");
      
      greetMe(loli);
      greetMe(lola);
      //greetMe(anjing);
    }
    
    public static void greetMe(Animal a){
        a.greets();
    }
}
