# Java Set and Map

## Introduction
Java provides powerful interfaces for working with collections of objects. Two important interfaces are `Set` and `Map`. Both are part of the `java.util` package and serve different purposes:
- `Set` is used for storing unique elements.
- `Map` is used for mapping keys to values.

## Set in Java
A `Set` is a collection that **does not allow duplicate elements**. It models the mathematical set abstraction.

There are three main implementations of `Set`:
- `HashSet`: Does not maintain any order of elements.
- `LinkedHashSet`: Maintains insertion order.
- `TreeSet`: Maintains elements in ascending order (sorted).

### Set Methods
Here are some common methods available in the `Set` interface:

| Method | Description |
|--------|-------------|
| `add(E e)` | Adds the specified element to the set if it is not already present. |
| `remove(Object o)` | Removes the specified element from the set, if it exists. |
| `contains(Object o)` | Returns `true` if the set contains the specified element. |
| `size()` | Returns the number of elements in the set. |
| `isEmpty()` | Returns `true` if the set is empty. |
| `clear()` | Removes all elements from the set. |
| `iterator()` | Returns an iterator over the elements in the set. |

### Set Example
```java
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Trying to add a duplicate element
        set.add("Apple"); // This will be ignored

        // Iterating over elements
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Checking if set contains a specific element
        if (set.contains("Banana")) {
            System.out.println("Set contains Banana");
        }

        // Removing an element
        set.remove("Orange");

        // Checking the size of the set
        System.out.println("Set size: " + set.size());
    }
}
```

## Map in Java
A `Map` is a collection that **maps keys to values**. A key in a `Map` must be unique, but values can be duplicated. It is often used when you want to store relationships between two objects, such as a dictionary where a word (key) maps to a definition (value).

There are several implementations of `Map`:
- `HashMap`: No guarantee of order.
- `LinkedHashMap`: Maintains insertion order.
- `TreeMap`: Maintains sorted order of keys.

### Map Methods
Here are some common methods available in the `Map` interface:

| Method | Description |
|--------|-------------|
| `put(K key, V value)` | Associates the specified value with the specified key in the map. |
| `get(Object key)` | Returns the value to which the specified key is mapped, or `null` if no mapping is found. |
| `remove(Object key)` | Removes the mapping for a key from this map if it exists. |
| `containsKey(Object key)` | Returns `true` if the map contains a mapping for the specified key. |
| `containsValue(Object value)` | Returns `true` if the map maps one or more keys to the specified value. |
| `size()` | Returns the number of key-value mappings in the map. |
| `isEmpty()` | Returns `true` if the map contains no key-value mappings. |
| `keySet()` | Returns a `Set` view of the keys contained in this map. |
| `values()` | Returns a `Collection` view of the values contained in this map. |

### Map Example
```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Accessing a value using its key
        int appleQuantity = map.get("Apple");
        System.out.println("Apple Quantity: " + appleQuantity);

        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is in the map");
        }

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing an entry by key
        map.remove("Orange");

        // Checking the size of the map
        System.out.println("Map size: " + map.size());
    }
}
```