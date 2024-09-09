/**
 * The superclass Monster defines the expected common behaviors for its subclasses.
 */
public class Monster {
   // private instance variable
   private String name;

   /** Constructs a Monster instance with the given name */
   public Monster(String name) {
      this.name = name;
   }

   /** Defines a common behavior called attack() for all its subclasses */
   public String attack() {
      return "!^_&^$@+%$* I don't know how to attack!";
      // We have a problem here!
      // We need to return a String; else, compilation error!
   }
}