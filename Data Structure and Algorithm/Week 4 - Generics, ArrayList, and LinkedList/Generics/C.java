package Generics;
public class C<T> {
    private T [] c;
    private int size;
    
    public C (int size) {
        this.c = new T[size];
        size = 0;
    }

    public void addMe (Object a){
        c[size] = a;
        size++;
    }

    public String toString(){
        String o = "";
        for (int i = 0; i < size; i++){
            o += c[i] + " ";
        }
        return o;
    }

}
