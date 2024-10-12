
# Java Collections: List, Stack, and Queue

## 1. List

### Introduction
A `List` is an ordered collection (also known as a sequence) in Java that allows duplicate elements. Lists allow positional access and manipulation of elements.

### Common Implementations:
- **ArrayList**: Resizable-array implementation of the `List` interface. It provides fast random access.
- **LinkedList**: Doubly-linked list implementation of the `List` and `Deque` interfaces.

### Commonly Used Methods in List:
- `add(E e)`: Appends the specified element to the end of the list.
- `get(int index)`: Returns the element at the specified position in the list.
- `set(int index, E element)`: Replaces the element at the specified position in the list with the specified element.
- `remove(int index)`: Removes the element at the specified position in the list.
- `size()`: Returns the number of elements in the list.
- `isEmpty()`: Returns `true` if the list contains no elements.
- `contains(Object o)`: Returns `true` if the list contains the specified element.

### Example of List in Java
```java
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating a List
        List<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Modifying elements
        list.set(1, "Blueberry");

        // Removing elements
        list.remove(2);

        // Iterating through the list
        for (String item : list) {
            System.out.println(item);
        }
    }
}
```

## 2. Stack

### Introduction
A `Stack` is a Last In First Out (LIFO) data structure. It allows push and pop operations, meaning elements are added and removed from the same end.

### Commonly Used Methods in Stack:
- `push(E e)`: Pushes an element onto the stack.
- `pop()`: Removes and returns the element at the top of the stack.
- `peek()`: Returns the element at the top of the stack without removing it.
- `isEmpty()`: Returns `true` if the stack is empty.
- `search(Object o)`: Returns the 1-based position of the element on the stack.

### Example of Stack in Java
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");

        // Popping an element from the stack
        System.out.println("Popped: " + stack.pop());

        // Peeking the top element of the stack
        System.out.println("Top Element: " + stack.peek());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
```

## 3. Queue

### Introduction
A `Queue` is a First In First Out (FIFO) data structure. Elements are added at the end (rear) and removed from the front.

### Common Implementations:
- **LinkedList**: Implements both `List` and `Queue`. It allows elements to be added at the end and removed from the front.
- **PriorityQueue**: Implements `Queue` and sorts elements based on their priority.

### Commonly Used Methods in Queue:
- `offer(E e)`: Inserts the specified element into the queue.
- `poll()`: Retrieves and removes the head of the queue, or returns `null` if the queue is empty.
- `peek()`: Retrieves, but does not remove, the head of the queue, or returns `null` if the queue is empty.
- `isEmpty()`: Returns `true` if the queue is empty.

### Example of Queue in Java
```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("Car");
        queue.offer("Bus");
        queue.offer("Bike");

        // Polling (removing) an element from the queue
        System.out.println("Polled: " + queue.poll());

        // Peeking the head of the queue
        System.out.println("Head of queue: " + queue.peek());

        // Checking if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
```

## Conclusion
- **List**: Ordered collection with duplicates allowed, elements can be accessed by index.
- **Stack**: LIFO structure where elements are pushed and popped from the same end.
- **Queue**: FIFO structure where elements are added at the end and removed from the front.
