import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task9();
    }

    public static void task9(){
        Scanner scan = new Scanner(Main.class.getResourceAsStream("task9.txt"));
        String input = scan.nextLine();
        String [] inputSplit = input.split(", ");
        int [] number = new int[inputSplit.length];
        for (int i =0; i< inputSplit.length;i++){
            number[i] = Integer.parseInt(inputSplit[i]);
        }
        int m = number[0];
        int s = number[1];
        int h = number[2];

        for (int i = s-1; i > m; i--){
            if (i == h) break;
            if (i % 2 ==0 && i % 3 == 0){
                System.out.println(i);
            }
        }

    }
}
