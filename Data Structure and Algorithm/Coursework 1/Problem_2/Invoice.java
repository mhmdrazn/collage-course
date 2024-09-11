package Problem_2;

/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework 01
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */
 
 public class Invoice {
    private int id;
    private Customer customer;    
    private double amount;

    // definisikan constructor Invoice dengan attribute id, customer, dan amount
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    //getter method untuk mendapatkan id invoice
    public int getId() {
        return id;
    }

    //getter method untuk mendapatkan customer
    public Customer getCustomer() {
        return customer;
    }

    //setter method untuk mengubah customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //getter method untuk mendapatkan amount
    public double getAmount() {
        return amount;
    }

    //setter method untuk mengubah amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    //getter method untuk mendapatkan id customer
    public int getCustomerId() {
        return customer.getId();
    }

    //getter method untuk mendapatkan name customer
    public String getCustomerName() {
        return customer.getName();
    }

    //getter method untuk mendapatkan discount customer
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    //getter method untuk mendapatkan amount setelah discount
    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount() / 100);
    }

    //method toString untuk menampilkan attribut invoice
    public String toString() {
        return "Invoice[id=" + this.getId() + ",customer=" + customer.getName() + "(" + customer.getId() + ")"  + "(" + customer.getDiscount() + "%)" + ",amount=" + amount + "]";
    }
}