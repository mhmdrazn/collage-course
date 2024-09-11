import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task7();
    }
    public static void task7(){
        Scanner sc = new Scanner(Main.class.getResourceAsStream("task7.txt"));
        int input = sc.nextInt();

        int bil1 = (input/100)%10;
        int bil2 = (input/10)%10;
        int bil3 = input%10;

        if (input%7 == 0){
            System.out.println(input - bil3);
        } else if (input%23 == 0) {
            System.out.println(input - bil2);
        } else {
            System.out.println(input - bil1);
        }
    }
}
