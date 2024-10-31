public class Main {
    public static void main(String[] args) {
        // iterateNumber(5);
        // printStars(5);
        multiplyEven(2);
        int [] a =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        binarySearch(a, 9);
    }

    static void iterateNumber(int n){
        if (n == 1){
            System.out.print(1);
        }
        else {
            iterateNumber(n-1);
            System.out.print(", ");
            System.out.print(n);
        }
    }
    // Write a method writeChars that accepts an integer parameter n and that prints out n characters as follows. The middle character of the output should always be an asterisk ("*"). If you are asked to write out an even number of characters, then there will be two asterisks in the middle ("**"). Before the asterisk(s) you should write out less-than characters ("<"). After the asterisk(s) you should write out greater-than characters (">"). For example, the following calls produce the following output:

    // Call	Output
    // writeChars(1);	*
    // writeChars(2);	**
    // writeChars(3);	<*>
    // writeChars(4);	<**>
    // writeChars(5);	<<*>>
    // writeChars(6);	<<**>>
    // writeChars(7);	<<<*>>>
    // writeChars(8);	<<<**>>>    

    public static void writeChars(int n) {
        if (n == 1) {
            System.out.print("*");
        } else if (n == 2) {
            System.out.print("**");
        } else {
            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
        }
    }


    public static int multiplyEven(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("exception");
        } else {
            if (n == 1) {
                return 2;
            } else {
                return multiplyEven(n - 2)*n*2;
            }
        }
    }

    // Write a recursive method named binarySearch that accepts a sorted array of integers and an integer target value and uses a recursive binary search algorithm to find and return an index at which that target value is found in the array. If the target value is not found in the array, return -1. The following code shows some example calls and their expected return values:

    // // index    0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16
    // int[] a = {-4,  2,  7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};
    
    // int index = binarySearch(a, 42);   // 10
    // int index = binarySearch(a, 66);   // -1

    public static int binarySearch(int[] a, int target) {
        return binarySearchHelper(a, target, 0, a.length - 1);
    }

    private static int binarySearchHelper(int[] a, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (a[mid] == target) {
            return mid;
        } else if (a[mid] < target) {
            return binarySearchHelper(a, target, mid + 1, right);
        } else {
            return binarySearchHelper(a, target, left, mid - 1);
        }
    }
}
