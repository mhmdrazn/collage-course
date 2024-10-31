package SelectionSort;

public class Main{
    public static void main(String[] args) {
        int [] array = {1, 5, 3, 2, 4};

        SelectionSort(array);

        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static void SelectionSort(int [] array){
        for (int i = 0; i < array.length; i++){
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
} 
