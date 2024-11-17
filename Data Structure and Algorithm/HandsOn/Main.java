
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {44, 75, 23, 43, 55, 12, 64, 77, 33};       

        System.out.print("Bubble Sort: ");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] bubbleSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; 
                }
            }
        }
        return arr;
    }

    static int[] selectionSort(int [] arr){
        
    }
}