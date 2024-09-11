package Problem_1;

/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework 01
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */
 
 public class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    // desinisikan constructor Employee dengan attribute id, firstName, lastName, dan salary
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    // getter method untuk mendapatkan id employee
    public int getId(){
        return id;
    }
    
    // getter method untuk mendapatkan firstName employee
    public String getFirstName(){
        return firstName;
    }
    
    // getter method untuk mendapatkan lastName employee
    public String getLastName(){
        return lastName;
    }

    // getter method untuk mendapatkan name (firstName dan lastName) employee
    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    // getter method untuk mendapatkan salary employee
    public int getSalary(){
        return salary;
    }

    // setter method untuk mengubah salary employee
    public void setSalary(int salary){
        this.salary = salary;
    }

    // getter method untuk mendapatkan annual salary employee
    public int getAnnualSalary(){
        return salary * 12;
    }

    // method untuk memperbarui value salary employee sesuai dengan persentase
    public int raiseSalary(int percent){
        this.salary = salary + (salary * percent / 100);
        return salary;
    }

    // method toString untuk menampilkan attribut employee
    public String toString(){
        return "Employee[id=" + this.getId() + ",name=" + this.getFirstName() + " " + this.getLastName() + ",salary=" + this.getSalary() + "]";
    }    
}