package Generics;
public class Main {
    public static void main(String[] args) {
        C data = new C(3);
        data.addMe(1);
        data.addMe(2);
        data.addMe(3);

        System.out.println(data);
    }
}
