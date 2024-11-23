import java.util.*;

public class SocialNetworkGraph {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private Map<String, List<String>> adjacencyList = new HashMap();
    
    public void addUser(String user){
        adjacencyList.putIfAbsent(user, new ArrayList<>());
    }

    public void addFriendship(String user1, String user2){
        adjacencyList.get(user1).add(user2);
        adjacencyList.get(user2).add(user1);
    }

    // BFS Implementation
    public void bfs(String startUser){
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(startUser);
        visited.add(startUser);

        System.out.println("BFS : ");
        while(!queue.isEmpty()){
            String user = queue.poll();
            System.out.print(user + " ");

            for (String friend: adjacencyList.get(user)){
                if (!visited.contains(friend)){
                    visited.add(friend);
                    queue.add(friend);
                }
            }
        }
        System.out.println();
    }

        public void dfs(String startUser){
            Set<String> visited = new HashSet<>();
            System.out.println("DFS : ");
            dfsHelper(startUser, visited);
            System.out.println();
        }

        public void dfsHelper(String user, Set<String> visited){
            // cek apakah user sudah dikunjungi
            if (visited.contains(user)) return;

            // jika belum dikunjungi, maka kunjungi
            visited.add(user);
            System.out.print(user + " ");

            // recursive call untuk setiap teman dari user
            for (String friend: adjacencyList.get(user)){
                dfsHelper(friend, visited);
            }
        }
}