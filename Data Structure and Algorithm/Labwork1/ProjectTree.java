import java.util.*;

public class ProjectTree {
    Map<String, ProjectNode> nodeMap;
    String rootName; // name of the root (MainProject)

    public ProjectTree(){
        nodeMap = new HashMap<>();
        rootName = null;
    }

    public void addMainProject(String name){
        this.rootName = name;
        
        ProjectNode mainProject = new ProjectNode(name);
        nodeMap.put(name, mainProject);
    }

    public void setLeftSubProject(String parentName, String subProjectName){
        ProjectNode parentProject = nodeMap.get(parentName);
        ProjectNode subProject = new ProjectNode(subProjectName);

        nodeMap.put(subProjectName, subProject);
        parentProject.setLeftSubProjectName(subProjectName);
    }

    public void setRightSubProject(String parentName, String subProjectName){
        ProjectNode parentProject = nodeMap.get(parentName);
        ProjectNode subProject = new ProjectNode(subProjectName);

        nodeMap.put(subProjectName, subProject);
        parentProject.setRightSubProjectName(subProjectName);
    }

    public int countTotalProject(String nodeName){
        ProjectNode node = nodeMap.get(nodeName);
        if (node == null) return 0;

        int totalCount = 0;

        // hitung total project dari subproject kiri dan kanan dari node
        if (node.getLeftSubProjectName() != null){
            totalCount += countTotalProject(node.getLeftSubProjectName());
        }
        
        if (node.getRightSubProjectName() != null){
            totalCount += countTotalProject(node.getRightSubProjectName());
        }

        return totalCount + 1; // tambahkan satu untuk node itu sendiri
    }

    public void findLongestPath(String nodeName, List<String> path, List<String> longestPath){
        ProjectNode node = nodeMap.get(nodeName);
        if (node == null) return;
        
        path.add(nodeName);
        
        // cek apakah node merupakan node akhir
        if (node.getLeftSubProjectName() == null && node.getRightSubProjectName() == null){
            if (path.size() > longestPath.size()){
                longestPath.clear();
                longestPath.addAll(new ArrayList<>(path));
            }
        } else { // jika node bukan node akhir, maka cari path dari subproject kiri dan kanan
            if (node.getLeftSubProjectName() != null) {
                findLongestPath(node.getLeftSubProjectName(), path, longestPath);
            }
            if (node.getRightSubProjectName() != null) {
                findLongestPath(node.getRightSubProjectName(), path, longestPath);
            }
        }

        path.remove(path.size() - 1); // untuk menghapus node dari path saat kembali dari recursive
    }

    public void findAllLeafProjects(String nodeName, List<String> leafProject){
        ProjectNode node = nodeMap.get(nodeName);
        if (node == null) return;

        // cek apakah node merupakan node akhir (leaf)
        if (node.getLeftSubProjectName() == null && node.getRightSubProjectName() == null){
            leafProject.add(nodeName);
        } else { // jika bukan node akhir, maka cari leaf project dari subproject kiri dan kanan
            if  (node.getLeftSubProjectName() != null){
                findAllLeafProjects(node.getLeftSubProjectName(), leafProject);
            }
            if (node.getRightSubProjectName() != null){
                findAllLeafProjects(node.getRightSubProjectName(), leafProject);
            }
        }
    }
}
