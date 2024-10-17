package Q6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 8, 5, 6};
        findNumber(a);
    }

    public static void findNumber(int[] a) {
        Stack<Integer> stack = new Stack<Integer>();
        
        // pop all the elements of stack that not less than the current element
        for (int v : a) {
            while (!stack.isEmpty() && stack.peek() >= v) {
                stack.pop();
            }
            stack.push(v); 
        }

        // print all elements in the stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}