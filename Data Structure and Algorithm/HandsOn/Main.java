public class Main {
    public static void main(String[] args) {
        int[] arr = {44, 75, 23, 43, 55, 12, 64, 77, 33};       
        
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        quickSort(arr, 0, arr.length-1); // set high ke arr.length - 1 biar gk outofbounds

        for (int a : arr){
            System.out.print(a + " ");
        }
    }

    public static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; 
                }
            }
        }
    }

    public static void selectionSort(int [] arr){
        int length = arr.length;

        for (int i = 0; i < length - 1; i++){ // loops-nya ga perlu sampai index terakhir
            int minIndex = i; // set min index sesuai sama pointernya sekarang

            // cari index dari value terkecil
            for (int j = i + 1; j < length; j++){
                if (arr[j] < arr[minIndex]){
                    // get the index of minimum value 
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        int length = arr.length;

        for (int i = 1; i < length; i++){ // mulai dengan indeks ke dua
            int temp = arr[i]; // simpan ke dalam temp
            int j = i - 1; 

            while (j >= 0 && arr[j] > temp){ // jangan lupa bandingkan dengan temp
                // swap
                arr[j + 1] = arr[j]; // geser elemen yg lebih besar ke kanan
                --j; 
            }

            arr[j + 1] = temp;
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
        int i = low - 1; // set i nya di low - 1, buat inisialisasi

        for (int j = low; j < high - 1; j++){ // set iterasi sampai high - 1
            if (arr[j] < pivot){
                i++; // jangan lupa di increment dulu i nya
                // Swap element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot dengan element i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;        
        return i + 1;
    }
}