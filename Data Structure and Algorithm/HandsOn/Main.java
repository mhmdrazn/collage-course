public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 2, 6, 4};       
        
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        quickSort(arr, 0, arr.length-1); // set high ke arr.length - 1 biar gk outofbounds

        for (int a : arr){
            System.out.print(a + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length - 1; i++){
            for (int j = 0; j < length - 1; j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    } 

    public static void selectionSort(int [] arr){
        int length = arr.length;

        for (int i = 0; i < length - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int [] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp){
                // swap 
                arr[j + 1] = arr[j];
                --j;
            }

            // balikin
            arr [j + 1] = temp;
        }
    }

    // 3, 2, 4
    // temp -> 2
    // j -> 3
    // karena j > temp, maka j dipindah ke posisi nya temp, yakni arr[j + 1]
    // terus kita harus balikin temp ke tempat yg bener, dimana j nya udah di decrement di dalem loop, jadinya kita harus + 1

    public static void quickSort(int [] arr, int low, int high){
        if (low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high - 1; j++){
            if (arr[j] < pivot){
                i++;
                // swap i dengan j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivotnya
        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;
    }

    // private static int partition(int [] arr, int low, int high){
    //     int pivot = arr[high];
    //     int i = low - 1; // set i nya di low - 1, buat inisialisasi

    //     for (int j = low; j < high - 1; j++){ // set iterasi sampai high - 1
    //         if (arr[j] < pivot){
    //             i++; // jangan lupa di increment dulu i nya
    //             // Swap element
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }

    //     // swap pivot dengan element i + 1
    //     int temp = arr[i + 1];
    //     arr[i + 1] = arr[high];
    //     arr[high] = temp;        
    //     return i + 1;
    // }
}
