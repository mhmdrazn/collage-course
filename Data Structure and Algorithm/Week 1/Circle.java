import java.lang.Math.*;

public class Circle{
    private double radius;
    private String color;
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    double getRadius(){
        return radius;
    }

    String getColor() {
        return color;
    }
    
    void setRadius(double radius){
        this.radius = radius;
    }
    
    void setColor(String color){
        this.color = color;
    }
    
    double getArea(){
        return Math.PI * radius * radius;
    }
    
    public String toString(){
        return "Area of tutupbotol which has " + this.getColor() + " is " + this.getArea();
    }
}