import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task10();
    }

    public static void task10(){
        int m = 1;
        int s = 36;
        int h = 12;

        for (int i = s - 1; i > m; i--) {
            if (i == h) break;
            if (i % 3 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
