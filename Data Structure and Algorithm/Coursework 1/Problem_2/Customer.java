package Problem_2;

/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework 01
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

 public class Customer {
    private int id;
    private String name;
    private int discount;


    // definisikan constructor Customer dengan attribute id, name, dan discount
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // getter method untuk mendapatkan id customer
    public int getId() {
        return id;
    }

    // getter method untuk mendapatkan name customer
    public String getName() {
        return name;
    }

    // getter method untuk mendapatkan discount customer
    public int getDiscount() {
        return discount;
    }

    // setter method untuk mengubah discount customer
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // method toString() untuk menampilkan attribute customer
    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";
    }
}
