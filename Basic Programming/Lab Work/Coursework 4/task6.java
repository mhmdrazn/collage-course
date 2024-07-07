import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task6();
    }

    public static void task6(){
        Scanner scan = new Scanner(Main.class.getResourceAsStream("task6.txt"));
        String input = scan.nextLine();
        String [] number = input.split(", ");
    
        int [] angka = new int[number.length];
        for (int i = 0;i<number.length;i++){
            angka[i] = Integer.parseInt(number[i]);
        }
    
        swap(angka, 3,1);
        swap(angka, 5,7);
        swapLast(angka, 4,1);
    
        for (int i =0; i<angka.length;i++){
            System.out.print(angka[i]);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = temp;
    }
    
    public static void swapLast(int[] arr, int a, int b){
        int temp = arr[a-1];
        arr[a-1] = arr[b+1];
        arr[b+1] = temp;
    }
}
