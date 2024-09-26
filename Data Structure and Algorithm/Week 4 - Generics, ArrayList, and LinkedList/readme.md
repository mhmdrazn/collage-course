# Java Generics, ArrayList, and LinkedList

## 1. **Generics in Java**

### **Definition:**
Generics allow you to create classes, interfaces, and methods that operate on types specified at runtime, providing stronger type checks and preventing errors like `ClassCastException`. They help in writing more flexible and reusable code.

### **Key Features:**
- **Type Safety:** Compile-time checking of types to avoid `ClassCastException`.
- **Code Reusability:** Methods, classes, and interfaces can work with any object type.
- **Avoid Casting:** Reduces the need for explicit casting when retrieving objects.

### **Syntax:**
```java
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
```
In the above example:
- `T` is a **type parameter** that can be replaced by any type (e.g., `Box<Integer>`, `Box<String>`).

### **Generic Methods:**
Generics can also be used in methods.
```java
public static <T> void printArray(T[] inputArray) {
    for (T element : inputArray) {
        System.out.println(element);
    }
}
```
In this method, `T` is a type parameter that makes the method work with any type of array.

### **Bounded Type Parameters:**
Restrict the type parameter to specific types (or their subclasses).
```java
public class NumberBox<T extends Number> {
    private T value;
}
```
Here, `T` can only be a type that extends `Number` (e.g., `Integer`, `Double`).

### **Wildcards (`?`):**
Wildcards allow you to specify a type range without knowing the exact type.
- **Unbounded wildcard** (`?`): Accepts any type.
- **Upper bounded wildcard** (`? extends T`): Accepts `T` or any subclass.
- **Lower bounded wildcard** (`? super T`): Accepts `T` or any superclass.

### **Example of Wildcards:**
```java
public void printNumbers(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}
```

---

## 2. **ArrayList**

### **Definition:**
`ArrayList` is a resizable array implementation of the `List` interface in Java. It provides dynamic array behavior, meaning that it can grow and shrink automatically as you add or remove elements.

### **Key Features:**
- **Dynamic Resizing:** Automatically resizes when elements are added or removed.
- **Indexed Access:** Allows random access using indices, similar to arrays.
- **Duplicates Allowed:** Unlike `Set`, duplicates are allowed in `ArrayList`.

### **Common Methods:**

| Method | Description | Return Type |
| ------ | ----------- | ----------- |
| `add(E e)` | Adds an element to the end of the list. | `boolean` |
| `add(int index, E element)` | Inserts an element at the specified index. | `void` |
| `get(int index)` | Retrieves the element at the specified index. | `E` (generic type) |
| `remove(int index)` | Removes the element at the specified index. | `E` (generic type) |
| `remove(Object o)` | Removes the first occurrence of the specified element. | `boolean` |
| `size()` | Returns the number of elements in the list. | `int` |
| `contains(Object o)` | Checks if the list contains the specified element. | `boolean` |
| `clear()` | Removes all elements from the list. | `void` |
| `isEmpty()` | Checks if the list is empty. | `boolean` |
| `indexOf(Object o)` | Returns the index of the first occurrence of the specified element. | `int` |
| `set(int index, E element)` | Replaces the element at the specified index with the given element. | `E` (generic type) |

### **Syntax:**
```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");

String fruit = list.get(0); // Returns "Apple"
list.remove(1); // Removes "Banana"
```

### **Performance Consideration:**
- **Access Time:** O(1) for random access.
- **Insertion/Deletion Time:** O(n) when inserting or deleting at random positions (due to shifting elements).

---

## 3. **LinkedList**

### **Definition:**
`LinkedList` is a doubly-linked list implementation of the `List` and `Deque` interfaces. Unlike `ArrayList`, which uses a dynamic array, `LinkedList` stores its elements as a series of connected nodes. Each node contains a reference to the next and previous elements.

### **Key Features:**
- **Doubly Linked:** Each node points to both the next and the previous nodes.
- **Efficient Insertions/Deletions:** Especially efficient when adding/removing elements at the beginning or end of the list.
- **Sequential Access:** Accessing elements by index requires traversal from the start or end, making it slower than `ArrayList` for random access.

### **Common Methods:**

| Method | Description | Return Type |
| ------ | ----------- | ----------- |
| `add(E e)` | Adds an element to the end of the list. | `boolean` |
| `add(int index, E element)` | Inserts an element at the specified index. | `void` |
| `addFirst(E e)` | Inserts an element at the start of the list. | `void` |
| `addLast(E e)` | Inserts an element at the end of the list. | `void` |
| `get(int index)` | Retrieves the element at the specified index. | `E` (generic type) |
| `getFirst()` | Retrieves the first element in the list. | `E` (generic type) |
| `getLast()` | Retrieves the last element in the list. | `E` (generic type) |
| `remove(int index)` | Removes the element at the specified index. | `E` (generic type) |
| `removeFirst()` | Removes the first element in the list. | `E` (generic type) |
| `removeLast()` | Removes the last element in the list. | `E` (generic type) |
| `clear()` | Removes all elements from the list. | `void` |
| `size()` | Returns the number of elements in the list. | `int` |
| `contains(Object o)` | Checks if the list contains the specified element. | `boolean` |
| `isEmpty()` | Checks if the list is empty. | `boolean` |

### **Syntax:**
```java
import java.util.LinkedList;

LinkedList<String> list = new LinkedList<>();
list.add("Apple");
list.addFirst("Banana");

String fruit = list.getFirst(); // Returns "Banana"
list.removeLast(); // Removes "Apple"
```

### **Performance Consideration:**
- **Access Time:** O(n) for accessing elements by index (linear traversal).
- **Insertion/Deletion Time:** O(1) for adding/removing elements at the beginning or end.

---

## **Comparison: ArrayList vs LinkedList**

| Feature            | ArrayList                   | LinkedList                    |
|--------------------|-----------------------------|--------------------------------|
| **Underlying Structure** | Dynamic array                | Doubly linked nodes             |
| **Access Time**     | O(1) for random access       | O(n) for random access          |
| **Insertion/Deletion** | O(n) in the middle           | O(1) at the beginning/end       |
| **Memory Usage**    | Less (compact)               | More (due to node pointers)     |
| **Best Use Case**   | When frequent access by index is needed | When frequent insertions/deletions are required |

---

## **Conclusion:**
- **Generics** make code more flexible and type-safe, avoiding casting issues and reducing runtime errors.
- **ArrayList** is best for situations where you need fast random access, but less frequent insertions and deletions.
- **LinkedList** is ideal for applications where frequent insertion and deletion at the beginning or end are required, though it comes with a performance cost for random access.

---

### **References:**
- [Oracle Java Docs on Generics](https://docs.oracle.com/javase/tutorial/java/generics/)
- [Java ArrayList Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- [Java LinkedList Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)

---