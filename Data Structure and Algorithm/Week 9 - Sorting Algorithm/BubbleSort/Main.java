package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int [] array = {5, 3, 2, 4, 1};

        BubbleSort(array);

        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static void BubbleSort(int [] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
