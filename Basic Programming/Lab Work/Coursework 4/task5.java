public class Main{
    public static void main (String [] args){
        task5();
    }
    public static void task5(){
        Scanner sc = new Scanner(Main.class.getResourceAsStream("task5.txt"));
        String line = sc.nextLine();
        char[] karakter = new char[line.length()];

        for (int i=0; i< karakter.length; i++){
            char input = line.charAt(i);
            if(Character.isLetterOrDigit(input)){
                karakter[i] = input;
            }
        }

        for (int i = 0; i<karakter.length;i++){
            System.out.print(karakter[i]);
        }
    }
}
