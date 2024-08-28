public class Student{
    // states
    private String name;
    private double gpa;
    
    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    
    // getter or accesor
    public String getName(){
        return name;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    // setter or mutator
    public void setName(String name){
        this.name = name;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    public String toString(){
        return this.getName() + " is get " + this.getGpa() + " GPA in this semester";
    }
}