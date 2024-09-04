package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Substitution
            // a.  A subclass instance can be assigned (substituted) to a superclass' reference.
            // b. Once substituted, we can invoke methods defined in the superclass; we cannot invoke methods defined in the subclass.
            // c. However, if the subclass overrides inherited methods from the superclass, the subclass (overridden) versions will be invoked.

            // Substitute a subclass instance to a superclass reference
            Circle c1 = new Cylinder(1.1, 2.2);
            // c1 merupakan object yang memiliki instance Cylinder, namun kita assign ke Circle sebagai reference-nya

            // Invoke superclass Circle's methods
            System.out.println(c1.getRadius());
            //2.2

            // Cylinder bisa menggunakan method dari kelas Circle, namun tidak untuk kelas Cylinder.
            // Karena pada dasarnya object c1 memiliki reference ke Circle

            // CANNOT invoke method in Cylinder as c1 is a Circle reference
            c1.getHeight();
            //compilation error: cannot find symbol method getHeight()
            c1.getVolume();
            //compilation error: cannot find symbol method getVolume()

            System.out.println(c1.toString());  // Run the overridden version
            //Cylinder[height=1.1,Circle[radius=2.2]]
            System.out.println(c1.getArea());   // Run the overridden version
            //15.205308443374602

        // Upcasting and Downcasting
            // Upcasting
            Circle c1 = new Cylinder(1.1, 2.2);  // Compiler checks to ensure that R-value is a subclass of L-value.
            Circle c2 = new String();            // Compilation error: incompatible types

            // Downcasing
            Circle c1 = new Cylinder(1.1, 2.2);  // upcast is safe
            Cylinder cy1 = (Cylinder) c1;        // downcast needs the casting operator

        // instanceof
        System.out.println(c1 instanceof Circle);  // true
        
        if (c1 instanceof Circle) { ...... }
    }

}
