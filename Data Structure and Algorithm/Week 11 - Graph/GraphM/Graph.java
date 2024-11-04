package GraphM;

import java.util.*;

class GraphM{
    Map<String, ArrayList<String>> g; 
    
    GraphM(){
        this.g = new TreeMap<String, ArrayList<String>>();
    }
    
    void addEdge(String v1, String v2){
        ArrayList<String> al = g.get(v1); // ambil value dari v1
        if (al == null){ // apabila null buat array baru dan masukkan v2
            al = new ArrayList<>(); // buat array baru
            al.add(v2); // tambahkan v2  
            g.put(v1, al); // masukkan v2 ke map graph dgn key v1
        } else { // apabila array list value sudah ada
            al.add(v2); // tambahkan v2 ke dalam arraylist value al
        }

        // tambahkan juga edge kebalikannna (undirected)
        ArrayList<String> al2 = g.get(v2);
        if (al2 == null){
            al2 = new ArrayList<>();
            al2.add(v1);
            g.put(v2, al2);
        } else {
            al2.add(v1);
        }
    }

    void bfs(String root){
        ArrayList<String> visitedNodes = new ArrayList<String>();
        Stack<String> adj = new Stack<String>();
        adj.push(root);

        while(!adj.empty()){
            String v = adj.pop();

            if (!visitedNodes.contains(v)){
                visitedNodes.add(v);
                System.out.print(v + " - ");
            }

            ArrayList<String> al =g.get(v);

            Collections.sort(al, Collections.reverseOrder());

            for (String a:al){
                if (!visitedNodes.contains(a)){
                    adj.push(a);
                }
            }
        }
    }

    void dfs(String root){
        ArrayList<String> visitedNodes = new ArrayList<String>();
        Queue<String> adj = new LinkedList<String>();
        adj.add(root);

        while(!adj.isEmpty()){
            String v = adj.poll();

            if (!visitedNodes.contains(v)){
                visitedNodes.add(v);
                System.out.print(v + " - ");
            }

            ArrayList<String> al =g.get(v);

            Collections.sort(al, Collections.reverseOrder());

            for (String a:al){
                if (!visitedNodes.contains(a)){
                    adj.add(a);
                }
            }
        }
    }
    
    public String toString(){
        String output="";
        
        for(String k: g.keySet()){
            output+= k+"-->";
            for(String a:g.get(k)){
             output+= a+" ";
                
            }
            output+="\n";
        }
        
        return output;
    }

    
}