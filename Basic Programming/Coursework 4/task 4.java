import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task4();
    }
    public static void task4(){
        Scanner scan = new Scanner(Main.class.getResourceAsStream("task4.txt"));
        String line = scan.nextLine();
        String[] number = line.split(", ");
        int [] angka = new int[number.length];
        int genap = 1;
        int ganjil = 1;

        for (int i = 0;i<number.length;i++){
            angka[i] = Integer.parseInt(number[i]);
            if (angka[i]%2 == 0){
                genap *= angka[i];
            }else {
                ganjil *= angka[i];
            }
        }
        if (genap>ganjil) System.out.println("Selisih = "   + (genap-ganjil));
        else System.out.println("Selisih = " + (ganjil-genap));
    }
}
