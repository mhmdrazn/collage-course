import java.util.*;

public class Main{
    public static void main(String[] args){
        //Vehicle v = new Vehicle();
        
        //Vehicle b = new Truck();
        // this one is valid because we can initialiize a subclass into a superclass
        // which one is superclasss and which one is subclass? superclass is vehicle and subclass is truck

        //Bicycle b = new Bicycle();

        // Truck  t = new Vehicle(); 
        // this one is not valid bcs we cannot initialize a superclass into a subclass
        Vehicle bike = new Bicycle("Nike", "baru", null, 2000, 2);
        bike.start();
    }
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
        System.out.println("The " + this.vehicleType + " is starting again");
    } 

    public void stop(){
        System.out.println("The " + this.vehicleType + " is stopping");
    }

    public void accelerete(){
        System.out.println("The " + this.vehicleType + " is accelerating");
    }

    public void brake(){
        System.out.println("The " + this.vehicleType + " is braking");
    }

    public void displayInfo(){
        System.out.println("vehicleType : " + this.vehicleType);
        System.out.println("brand : " + this.brand);
        System.out.println("model : " + this.model);
        System.out.println("year : " + this.year);
    }

    //setter 
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    //getter
    public String getVehicleType(){
        return this.vehicleType;
    }
}

class Truck extends Vehicle{
    private int numWheels;
    
    public Truck(String vehicleType, String brand, String model, int year, int numWheels){
        super("Truck", brand, model , year);
        this.numWheels = numWheels;
    }

    public void honk(){
        System.out.println("The Truck is honking");
    }
}

class Bicycle extends Vehicle{
    private int numGears;

    public Bicycle(String vehicleType, String brand, String model, int year, int numGears){
        super("Bicycle", brand, model, year);
        this.numGears = numGears;
    }

    public void ringBell(){
        System.out.println("The Bicycle is ringing its bell");
    }

    //Overloading
    public void ringBell(String ringing){
        System.out.println("The Bicycle is ringing its bell, the sound is like " + ringing);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("numGears : " + numGears);
    }

    @Override
    public void start(){
        System.out.println("The Bicycle is starting ZzZzZzZzZzZz");
    }
}	

// there is some differences beetween public, private, and protected
// public : can be accesed from anywhere, trough the class and outside the class
// private : only can be accesed inside the class, not from outside the class
// protected : can be accesed from everywhere in same packages and subclasses
