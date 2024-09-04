package Inheritance;

/**
 * The Student class, subclass of Person.
 */
public class Student extends Person {
    // private instance variables
    private int numCourses;   // number of courses taken so far
    private String[] courses; // course codes
    private int[] grades;     // grade for the corresponding course codes
    private static final int MAX_COURSES = 30; // maximum number of courses
    
    /** Constructs a Student instance with the given name and address */
    public Student(String name, String address) {
       super(name, address);
       numCourses = 0;
       courses = new String[MAX_COURSES];
       grades = new int[MAX_COURSES];
    }
    
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
       return "Student: " + super.toString();
    }
    
    /** Adds a course and its grade - No input validation */
    public void addCourseGrade(String course, int grade) {
       courses[numCourses] = course;
       grades[numCourses] = grade;
       ++numCourses;
    }
    
    /** Prints all courses taken and their grade */
    public void printGrades() {
       System.out.print(this);
       for (int i = 0; i < numCourses; ++i) {
          System.out.print(" " + courses[i] + ":" + grades[i]);
       }
       System.out.println();
    }
    
    /** Computes the average grade */
    public double getAverageGrade() {
       int sum = 0;
       for (int i = 0; i < numCourses; i++ ) {
          sum += grades[i];
       }
       return (double)sum/numCourses;
    }
 }