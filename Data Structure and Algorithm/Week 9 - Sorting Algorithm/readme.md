# Sorting Algorithms in Java

This repository demonstrates the implementation of four common sorting algorithms in Java: **Bubble Sort**, **Selection Sort**, **Insertion Sort**, and **Quick Sort**. Below are brief explanations and code examples for each algorithm.

---

## 1. Bubble Sort
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. This process continues until the array is sorted.

### Algorithm:
1. Compare adjacent elements.
2. Swap if they are in the wrong order.
3. Repeat for all elements until no swaps are needed.

### Java Code:
```java
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
```

---

## 2. Selection Sort
Selection Sort selects the smallest (or largest) element from the unsorted portion and swaps it with the first element of the unsorted portion.

### Algorithm:
1. Find the minimum element in the unsorted array.
2. Swap it with the first unsorted element.
3. Move the boundary of the unsorted portion one step forward.

### Java Code:
```java
public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
```

---

## 3. Insertion Sort
Insertion Sort builds the sorted array one element at a time by picking elements from the unsorted portion and placing them in the correct position.

### Algorithm:
1. Start with the second element and compare it with elements before it.
2. Shift larger elements one position to the right.
3. Insert the current element into its correct position.

### Java Code:
```java
public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Shift elements of the sorted portion
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
```

---

## 4. Quick Sort
Quick Sort is a divide-and-conquer algorithm. It picks a pivot element and partitions the array into two halves: elements smaller than the pivot and elements larger than the pivot.

### Algorithm:
1. Select a pivot element.
2. Partition the array so that all elements smaller than the pivot are on the left and all larger elements are on the right.
3. Recursively apply the same logic to the sub-arrays.

### Java Code:
```java
public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);  // Left partition
            quickSort(array, pivotIndex + 1, high); // Right partition
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap elements
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap pivot with the element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
```

---

### Example Usage
```java
public class Main {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        // Bubble Sort
        BubbleSort.bubbleSort(array);

        // Selection Sort
        SelectionSort.selectionSort(array);

        // Insertion Sort
        InsertionSort.insertionSort(array);

        // Quick Sort
        QuickSort.quickSort(array, 0, array.length - 1);

        // Print sorted array
        System.out.println(Arrays.toString(array));
    }
}
```

---

### Complexity Table
| Algorithm      | Best Case   | Average Case | Worst Case  |
|----------------|-------------|--------------|-------------|
| Bubble Sort    | O(n)        | O(n²)        | O(n²)       |
| Selection Sort | O(n²)       | O(n²)        | O(n²)       |
| Insertion Sort | O(n)        | O(n²)        | O(n²)       |
| Quick Sort     | O(n log n)  | O(n log n)   | O(n²)       |

--- 

This `README.md` provides both explanations and examples for easy reference and learning.