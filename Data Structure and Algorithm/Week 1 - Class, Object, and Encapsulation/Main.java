/**
 * Main class of the Java program.
 */

 public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Razan", 4.00);
        //System.out.println(student1.getName() + " is get " + student1.getGpa() + " GPA in this semester");
        System.out.println(student1);
        
        Circle tutupbotol = new Circle(1.25, "biru");
        // System.out.println("Area of tutupbotol which has " + tutupbotol.getColor() + " is " + tutupbotol.getArea());
        System.out.println(tutupbotol);
    }
}
