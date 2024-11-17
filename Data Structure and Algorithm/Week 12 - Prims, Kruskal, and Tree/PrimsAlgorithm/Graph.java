package PrimsAlgorithm;

import java.util.*;

class Graph{
    // the class fields
    private int g [][];
    private int size;
    private String label [];
    
    
    //constructors
    Graph(int s){
        this.size = s;
        this.g = new int[s][s];
    }
    
    Graph(int s, String [] l){
        this.size = s;
        this.g = new int[s][s];
        this.label = l;
    }
    
    //add unweigted edge
    void addEdge(int v1, int v2){
        g[v1][v2]=1;
        g[v2][v1]=1;
    }
    
    //add weigted edge
    void addEdge(int v1, int v2, int w){
        g[v1][v2]=w;
        g[v2][v1]=w;
    }
    
    //print the graph
    public String toString(){
        String output="";
        
        for(int i=0;i<g.length;i++){
            output+= label[i]+ "-->";
            for(int j=0; j<g[0].length;j++){
                if(g[i][j]>=1){
                    output+= label[j]+" ";
                }
            }
            output+="\n";
        }
        
        return output;
    }
    
    void primAlg(){
        boolean mst [][] = new boolean[this.size][this.size];
        int minLength=0;
        
        boolean[] visited = new boolean[this.size];
        
        int[] distance = new int[this.size];
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        // Node pertama akan menjadi root
        distance[0] = 0;
        
        // Array untuk menyimpan parent setiap node di MST
        int[] parent = new int[this.size];
        parent[0] = -1; // Node pertama merupakan root, jadi dia tdk punya parent
        
        // 
        for (int count = 0; count < this.size - 1; count++){
            
            // Cari node dengan nilai biaya terkecil dari set node yang belum dikunjungi
            int u = findMinKeyVertex(distance, visited);
            
            // Tambahkan nodenya ke MST
            visited[u] = true;
            
            // update distance values dan parent index dari adjacent node
            for (int v = 0; v < this.size; v++){
                // update jika
                // - terdapat edge dari u ke v
                // - v bukan di MST
                // - weight dari edge (u,v) lebih kecil
                if (g[u][v] > 0 && !visited[v] && g[u][v] < distance[v]){
                    parent[v] = u;
                    distance[v] = g[u][v];
                }
            }
        }
        
        for (int i = 1; i < this.size; i++){
            mst[parent[i]][i] = true;
            mst[i][parent[i]] = true;
            minLength += g[i][parent[i]];
        }
        
        //output
        System.out.print("\t");
        for(String l:this.label) System.out.print(l+"\t");
        System.out.println();
        for(int i=0; i<this.size;i++){
            System.out.print(this.label[i]+"\t");
            for(int j=0;j<this.size;j++){
                System.out.print(mst[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("MST length is: "+minLength);
        
    }
    
    private int findMinKeyVertex(int[] distance, boolean[] visited){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        
        for (int v = 0; v < this.size; v++){
            if (!visited[v] && distance[v] < min){
                min = distance[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
}