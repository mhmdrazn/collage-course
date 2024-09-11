package Inheritance;

/**
 * The superclass Person has name and address.
 */
public class Person {
    // private instance variables
    private String name, address;
    
    /** Constructs a Person instance with the given name and address */
    public Person(String name, String address) {
       this.name = name;
       this.address = address;
    }
    
    // Getters and Setters
    /** Returns the name */
    public String getName() {
       return name;
    }
    /** Returns the address */
    public String getAddress() {
       return address;
    }
    /** Sets the address */
    public void setAddress(String address) {
       this.address = address;
    }
    
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
       return name + "(" + address + ")";
    }
 }