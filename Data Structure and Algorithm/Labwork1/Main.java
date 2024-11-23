/**
 * ES234317 - Algorithms and Data Structures
 * Computing Lab. Work
 * Coursework No.   : 01
 * Student ID       : 5026231174
 * Student Name     : Muhammad Razan Parisya Putra
 * Class            : C
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        // task2();
        // task3();
        
    }
    
    public static void task1() {
        SocialNetworkGraph network = new SocialNetworkGraph();
    
        // Add users
        network.addUser("A");
        network.addUser("B");
        network.addUser("C");
        network.addUser("D");
        network.addUser("E");
        network.addUser("F");
        network.addUser("G");
        network.addUser("H");
        network.addUser("I");
    
        // Add friendships
        network.addFriendship("A", "B");
        network.addFriendship("A", "C");
        network.addFriendship("B", "D");
        network.addFriendship("B", "E");
        network.addFriendship("C", "F");
        network.addFriendship("D", "G");
        network.addFriendship("E", "H");
        network.addFriendship("F", "I");
    
        // Perform BFS and DFS starting from user A
        network.bfs("A");
        network.dfs("A");
    }
    
    public static void task2() {
        EmployeeTree hierarchy = new EmployeeTree();
        hierarchy.add("CEO");
        hierarchy.setLeftChild("CEO", "Manager1");
        hierarchy.setRightChild("CEO", "Manager2");
        hierarchy.setLeftChild("Manager1", "Employee1");
        hierarchy.setRightChild("Manager1", "Employee2");
        hierarchy.setLeftChild("Manager2", "Employee3");
        hierarchy.setRightChild("Manager2", "Employee4");

        // Task 1: Find Maximum Depth
        System.out.println("Maximum Depth: " + hierarchy.findMaxDepth("CEO"));

        // Task 2: List Employees by Level
        System.out.println("Employees by Level:");
        hierarchy.listEmployeesByLevel();

        // Task 3: Find a Specific Employee
        String searchName = "Employee3";
        System.out.println("Is " + searchName + " in the hierarchy? " + hierarchy.findEmployee("CEO", searchName));
    }
    
    public static void task3() {
        List<String> path = new ArrayList<>();
        List<String> longestPath = new ArrayList<>();
        List<String> leafProjects = new ArrayList<>();

        List<String> path2 = new ArrayList<>();
        List<String> longestPath2 = new ArrayList<>();
        List<String> leafProjects2 = new ArrayList<>();

        // Scenario 1
        ProjectTree projectTrees = new ProjectTree();
        
        projectTrees.addMainProject("MainProject");
        projectTrees.setLeftSubProject("MainProject", "SubProject1");
        projectTrees.setRightSubProject("MainProject", "SubProject2");
        projectTrees.setLeftSubProject("SubProject1", "SubSubProject1");
        projectTrees.setRightSubProject("SubProject1", "SubSubProject2");
        projectTrees.setLeftSubProject("SubProject2", "SubSubProject3");

        // count the total number of projects
        int totalProjects = projectTrees.countTotalProject("MainProject");
        System.out.println("Total Projects: " + totalProjects);

        // print the longest path from the root to a leaf
        projectTrees.findLongestPath("MainProject", path, longestPath);
        System.out.println("Longest Path: " + longestPath);

        // find all project with no subproject
        projectTrees.findAllLeafProjects("MainProject", leafProjects);
        System.out.println("Leaf Projects : " + leafProjects);

        // Scenario 2
        ProjectTree projectTrees2 = new ProjectTree();
        
        projectTrees2.addMainProject("MainProject");
        projectTrees2.setLeftSubProject("MainProject", "SubProject1");
        projectTrees2.setRightSubProject("MainProject", "SubProject2");
        projectTrees2.setLeftSubProject("SubProject1", "SubSubProject1");
        projectTrees2.setLeftSubProject("SubSubProject1", "SubSubSubProject1");
        projectTrees2.setLeftSubProject("SubProject2", "SubSubProject3");
        projectTrees2.setRightSubProject("SubProject2", "SubSubSubProject4");

        // count the total number of projects
        int totalProjects2 = projectTrees2.countTotalProject("MainProject");
        System.out.println("Total Projects: " + totalProjects2);

        // print the longest path from the root to a leaf
        projectTrees2.findLongestPath("MainProject", path2, longestPath2);
        System.out.println("Longest Path: " + longestPath2);

        // find all project with no subproject
        projectTrees2.findAllLeafProjects("MainProject", leafProjects2);
        System.out.println("Leaf Projects : " + leafProjects2);
    }   
}
