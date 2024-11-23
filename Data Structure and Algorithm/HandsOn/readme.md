# Sorting and Searching Algorithms Summary

This document provides a summary of six common algorithms: **Bubble Sort**, **Selection Sort**, **Insertion Sort**, **Quick Sort**, **Linear Search**, and **Binary Search**.

## 1. Sorting Algorithms

### Bubble Sort
- **Time Complexity:**
  - Best: `O(n)` (when the list is already sorted)
  - Average/Worst: `O(n²)`
- **Characteristics:**
  - **Stable**, **In-place**
  - Repeatedly compares adjacent elements and swaps them if they are in the wrong order.
  - Not efficient for large datasets due to `O(n²)` time complexity.

### Selection Sort
- **Time Complexity:**
  - Best/Average/Worst: `O(n²)`
- **Characteristics:**
  - **Unstable**, **In-place**
  - Finds the minimum (or maximum) element in the unsorted portion and swaps it with the first unsorted element.
  - Inefficient for large datasets because it always scans through the unsorted portion of the list.

### Insertion Sort
- **Time Complexity:**
  - Best: `O(n)` (when the list is already sorted)
  - Average/Worst: `O(n²)`
- **Characteristics:**
  - **Stable**, **In-place**
  - Builds the sorted array one element at a time by inserting each element into its correct position.
  - Efficient for small datasets or nearly sorted data.

### Quick Sort
- **Time Complexity:**
  - Best/Average: `O(n log n)`
  - Worst: `O(n²)` (with poor pivot choices)
- **Characteristics:**
  - **Unstable**, **In-place**
  - A **divide-and-conquer** algorithm that partitions the list around a pivot and recursively sorts the sublists.
  - Typically faster than other `O(n log n)` algorithms due to low overhead, but the worst-case performance can be poor without a good pivot strategy.

---

## 2. Searching Algorithms

### Linear Search
- **Time Complexity:**
  - Best: `O(1)` (if the element is at the start)
  - Worst: `O(n)`
- **Characteristics:**
  - Works on **unsorted** or **sorted** lists
  - Checks each element one by one until the target is found.
  - Simple but inefficient for large datasets due to `O(n)` time complexity.

### Binary Search
- **Time Complexity:**
  - Best: `O(1)`
  - Average/Worst: `O(log n)`
- **Characteristics:**
  - Works only on **sorted** lists
  - Efficient for large datasets, divides the search space in half at each step.
  - **Non-linear search**, it rapidly narrows down the target's location by comparing the middle element with the target.

---

## Key Points to Remember

- **Stable Sorting:** Keeps equal elements in their original order. **Bubble Sort** and **Insertion Sort** are stable.
- **In-place Sorting:** Sorts the list with minimal extra space. **Bubble Sort**, **Selection Sort**, **Insertion Sort**, and **Quick Sort** are in-place.
- **Binary Search** requires the list to be **sorted**, while **Linear Search** can work on both **sorted and unsorted** lists.
- **Time Complexity** is crucial for understanding the efficiency of an algorithm, especially when dealing with large datasets.
