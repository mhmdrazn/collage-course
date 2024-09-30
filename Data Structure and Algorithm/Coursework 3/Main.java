/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2024-2025
 * Coursework   : 03
 * Student ID   : 5026231174 
 * Full Name    : Muhammad Razan Parisya Putra
 * Class        : C
 */

 public class Main {

    public static void main(String[] args) {
        ArrayList myData = new ArrayList(7);
        myData.addFront(10);
        myData.addFront(20);
        myData.addFront(30);
        myData.addBack(100);
        myData.addAtIndex(1, 200);
        myData.addAtIndex(3, 99);
        myData.addBack(1000);
        myData.addFront(88);
        myData.addAtIndex(5, 111);
        myData.removeFront();
        myData.removeBack();
        myData.removeFromIndex(2);
        
        System.out.println(myData);
        
        LinkedList yourData = new LinkedList();
        yourData.addFront(1);
        yourData.addFront(2);
        yourData.addBack(3);
        yourData.addBack(5);
        yourData.addAtIndex(1,10);
        yourData.removeFront();
        yourData.removeBack();
        yourData.removeFromIndex(1);
        System.out.println(yourData);
        
        ArrayListG<String> ourData = new ArrayListG<String>(5);
        ourData.addFront("One");
        ourData.addFront("Two");
        ourData.addFront("Three");
        ourData.addFront("Four");
        ourData.addFront("Five");
        ourData.removeFront();
        ourData.removeBack();
        ourData.removeFromIndex(1);
        System.out.println(ourData);
        
        ArrayListG<Double> thisData = new ArrayListG<Double>(5);
        thisData.addFront(3.56);
        thisData.addFront(3.81);
        thisData.addFront(2.76);
        thisData.addFront(3.30);
        thisData.addFront(3.68);
        thisData.removeFront();
        thisData.removeBack();
        thisData.removeFromIndex(1);
        System.out.println(thisData);
    }
}
