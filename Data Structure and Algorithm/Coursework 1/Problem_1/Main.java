package Problem_1;

/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework 01
 * Student ID   : 5026231174
 * Full Name    : Muhammad Razan parisya Putra
 * Class        : C
 */

 public class Main {
    public static void main(String[] args) {
        // membuat objek employee1 dan set nilai atributnya
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        // update nilai salary menjadi dari objek employee1 menjadi 999
        employee1.setSalary(999);
        System.out.println(employee1);

        // Mencetak nilai atribut dari objek employee1
        System.out.println("id is : " + employee1.getId());
        System.out.println("firstname is: " + employee1.getFirstName());
        System.out.println("lastname is: " + employee1.getLastName());
        System.out.println("salary is: " + employee1.getSalary());
        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary());
        
        // Meningkatkan salary dari employee1 sebanyak 10%
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
