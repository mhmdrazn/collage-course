package Problem_1;

/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 02
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Wooow");
    }

    public void greets(Dog another){
        System.out.println("Woooooof");
    }

    public void greets(BigDog another){
        System.out.println("Wooooooooof");
    }
}
