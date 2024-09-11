package Problem_1;

/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 02
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
