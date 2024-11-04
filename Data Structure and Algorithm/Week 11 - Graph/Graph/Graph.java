package Graph;
public class Graph {
    int g [] [];
    int size;
    String[] label;
    
    Graph (int s){
        this.size = s;
        g = new int [s][s];
    }
    
    Graph (int s, String[] l){
        this.size = s;
        this.label = l;
        g = new int [s][s];
    }
    
    void addEdge(int v1, int v2){
        g[v1][v2] = 1;
        g[v2][v1] = 1;
    }

    void removeEdge(int v1, int v2){
        g[v1][v2] = 0;
        g[v2][v1] = 0;
    }

    public String toString(){
        String output = "";
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (g[i][j] == 1){
                    output += label[i] + "-->" + label[j] + " ";
                }
            }
            output += "\n";
        }
        return output;
    }
    
    void display(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }
    }
}