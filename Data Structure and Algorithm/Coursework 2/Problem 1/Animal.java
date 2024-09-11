/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 02
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

abstract public class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }

    abstract void greets();
}
