import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task10();
    }

    public static void task8(){
        Scanner scan = new Scanner(Main.class.getResourceAsStream("task8.txt"));
        int t = scan.nextInt();
        scan.nextLine();

        String[] name = new String [t];
        int[] anime = new int[t];
        int[] manga = new int[t];
        Float[] gpa = new Float[t];
        String [] genre = new String[t];


        for (int i = 0; i<t;i++){
            String input = scan.nextLine();
            String [] line = input.split(";");

            name[i] = line[0];
            anime[i] = Integer.parseInt(line[1]);
            manga[i] = Integer.parseInt(line[2]);
            gpa[i] = Float.parseFloat(line[3]);
            genre[i] = line[4];
        }

        for (int i = 0; i<t;i++){
            if(gpa[i]<1.0 || anime[i]<10 && manga[i]<10){
                System.out.println(name[i] + " Expelled");
            } else if (gpa[i] >= 2.5 || anime[i] >= 100 || manga[i] >= 100){
                System.out.println(name[i] + " Nihongo Jouzu");
            } else {
                System.out.println(name[i] + " Normie");
            }
        }
    }
}
