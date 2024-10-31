package InsertionSort;

public class Main {
    public static void main(String[] args) {
        int [] array = {1, 5, 3, 2, 4};

        InsertionSort(array);

        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static void InsertionSort(int [] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
