import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    public static void task1() {
        Game game = new Game();
        game.startGame();
    }

    public static void task2() {
        // inisialisasi array untuk menampung file input
        String[] inputLine = new String[4];

        try {
            // baca file input
            FileReader reader = new FileReader("src/input.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            int index = 0;

            while ((line = bufferedReader.readLine()) != null && index < inputLine.length) {
                inputLine[index++] = line;
            }
            reader.close();
            bufferedReader.close();

            // buat array untuk class Record
            Record[] records = new Record[4];

            // masukkan records ke dalam class Pos
            Pos pos = new Pos(records);

            // loops untuk memasukkan attributes record ke dalam object record
            for (int i = 0; i < inputLine.length; i++) {
                String[] parts = inputLine[i].split(",");
                if (parts.length < 4) {
                    System.out.println("Invalid record: " + inputLine[i]);
                    continue;
                }

                // buat array untuk masing masing attribute
                String name = parts[0];
                String date = parts[1];
                int amountOwned = Integer.parseInt(parts[2]);
                int amountPayed;
                try {
                    amountPayed = Integer.parseInt(parts[3]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid payment amount for " + name + ". Skipping this record.");
                    continue;
                }

                // buat object record baru dan inisialisasi attributenya
                Record record = new Record(name, date, amountOwned, amountPayed);

                // tambahkan object record yang telah dibuat ke dalam class Pos
                pos.add(record);
            }

            // loops untuk menampilkan details masing masing record
            for (int i = 0; i < pos.getLength(); i++) {
                Record record = pos.getRecord(i);
                System.out.println("Buyer's name    : " + record.getName());
                System.out.println("Payment date    : " + record.getDate());
                System.out.println("Amount Owed     : " + record.getAmountOwned());
                System.out.println("Amount Payed    : " + record.getAmountPayed());
                System.out.println("Change          : " + record.getChange());
                System.out.println("Change Details  :\n");
                System.out.println(pos.change(record.getChange()));
            }

        } catch (IOException e) { // exception handling ketika tidak bisa membaca file input
            System.out.println("Oops! Error while reading the file! :(");
        } catch (NumberFormatException e) { // exception handling ketika format input yang salah
            System.out.println("Cannot convert String to Integer, Because: ");
            System.out.println(e);
        }
    }
}
