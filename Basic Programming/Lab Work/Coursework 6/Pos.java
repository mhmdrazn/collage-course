import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Pos {
    private Record[] records;
    private int length;
    private int changes;
    private Record recordan;

    public Pos(Record[] records){
        this.records = records;
        this.length = 0; // inisialisasi length ke 0
    }

    public void add(Record recordan){
        records[length] = recordan;
        length++;
    }

    public String change(int changes){
        // deklarasi dan inisialisasi array denominations
        int[] denominations = {100000, 50000, 20000, 10000, 5000, 2000, 1000};

        // buat object untuk membuat header print
        StringBuilder result = new StringBuilder("====================================\nDenominations\t|\tQuantity\n====================================\n");

        // loops untuk mengecek kembalian dan jumlahnya
        for (int i = 0; i < denominations.length; i++) {
            if (changes / denominations[i] > 0) {
                int count = changes / denominations[i];

                // tampilkan hasil denomination dan jumlahnya
                result.append(denominations[i]).append("\t\t\t|\t").append(count).append("\n");

                // recursive untuk melakukan method change hingga kembalian habis
                changes %= denominations[i];
            }
        }
        return result.toString();
    }

    public int getLength(){
        return length;
    }

    public Record getRecord(int index){
        if (index >= 0 && index < length) {
            return records[index];
        } else {
            // exception throw apabila index yang diinput tidak valid
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }
}
