import java.util.*;

public class Main{
    public static void main(String[] args) {
        // Vehicle a = new Vehicle();
        // Vehicle b = new Truck();
        // Bicycle c = new Bicycle();
        // Truck d = new Vehicle();

        Vehicle v = new Bicycle();
        Truck t = new Truck();

    }

    class Vehicle{
        private String vehicleType;
        private String brand;
        private String model;
        private int year;

        public Vehicle(String vehicleType, String brand, String model, int year){
            this.vehicleType = vehicleType;
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public void start(){
            System.out.println("The " + this.vehicleType + "is starting");
        }
        
        public void stop(){
            System.out.println("The " + this.vehicleType + "is stopping");
        }
        
        public void acceelerate(){
            System.out.println("The " + this.vehicleType + "is acceleratiing");
        }

        public void brake(){
            System.out.println("The " + this.vehicleType + "is braking");
        }

        public void displayInfo(){
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Brand: " + this.brand);
            System.out.println("Model: " + this.model);
            System.out.println("Year: " + this.year);
        }
    }

    class Truck extends Vehicle{
        public int numWheels;

        public Truck(String vehicleType, String brand, String model, int year, int numWheels){
            super("Truck", brand, model, year);
            this.numWheels = numWheels;
        }
        
        public void honk(){
            System.out.println("The " + vehicleType + " is honking");
        }
    }

    class Bicycle extends Vehicle{
        public int numGears;

        public Bicyle(String vehicleType, String brand, String model, int year, int numGears){
            super("Bicycle", brand, model, numGears);
            this.numGears = numGears;
        }
        
        public void ringBell(){
            System.out.println("The " + this.vehicleType + " is ringing its bell");
        }
    }


}
