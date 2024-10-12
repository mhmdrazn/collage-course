
# Java Set Overview

## Introduction
A `Set` is one of the core interfaces in Java's **Collections Framework**. It represents a collection that does not allow duplicate elements and does not maintain any particular order. The `Set` interface is a subtype of the `Collection` interface.

## Key Characteristics of Set:
- **No Duplicates**: The main characteristic of a `Set` is that it cannot contain duplicate elements.
- **Unordered**: A `Set` does not maintain the insertion order of elements, unlike a `List`.

## Types of Sets
- **HashSet**: Implements the `Set` interface and is backed by a hash table. It does not guarantee any order.
- **LinkedHashSet**: Extends `HashSet` and maintains a doubly-linked list across all elements, preserving insertion order.
- **TreeSet**: Implements `Set` and extends `NavigableSet`, internally uses a `TreeMap`, and stores elements in sorted order.

## Commonly Used Methods
Here are some of the methods provided by the `Set` interface:

- `add(E e)`: Adds the specified element to the set if it is not already present.
- `remove(Object o)`: Removes the specified element from the set, if it is present.
- `contains(Object o)`: Returns `true` if this set contains the specified element.
- `size()`: Returns the number of elements in the set.
- `isEmpty()`: Returns `true` if this set contains no elements.
- `clear()`: Removes all the elements from the set.
- `iterator()`: Returns an iterator over the elements in the set.
- `addAll(Collection<? extends E> c)`: Adds all the elements from the specified collection to the set.

## Example of Set in Java

```java
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> fruits = new HashSet<>();

        // Adding elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element, will not be added

        // Displaying the Set
        System.out.println("Fruits Set: " + fruits);

        // Checking if a specific element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is present in the Set.");
        }

        // Removing an element from the set
        fruits.remove("Orange");

        // Display the size of the set
        System.out.println("Set size: " + fruits.size());

        // Iterating over the elements in the set
        System.out.println("Iterating through Set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the Set
        fruits.clear();
        System.out.println("Is the set empty? " + fruits.isEmpty());
    }
}
```

## Output:
```
Fruits Set: [Banana, Apple, Orange]
Banana is present in the Set.
Set size: 2
Iterating through Set:
Banana
Apple
Is the set empty? true
```

## Additional Information
- **Performance**: `HashSet` provides constant time performance for basic operations like `add`, `remove`, and `contains`, assuming the hash function disperses elements properly.
- **Thread Safety**: The `Set` interface and its implementations are not synchronized. If multiple threads access a `Set` concurrently, and at least one thread modifies it, external synchronization is needed.
