package BinarySearchAlgorith;

public class Main {
    public static void main(String[] args) {
        int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        binarySearch(a, 9);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
