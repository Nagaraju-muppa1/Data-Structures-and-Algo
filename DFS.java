import java.util.*;
public class DFS {
    public static void dfsofGraph(int start,List<List<Integer>> graph,boolean[] visited){
        visited[start]=true;
        System.out.print(start+" ");
        for(int a:graph.get(start)){
            if(!visited[a]){
                dfsofGraph(a,graph,visited);
            }
        }  
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the graph:");
        int n = sc.nextInt();
        boolean[] visited = new boolean[n];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        System.out.println("Enter the no of Edges:");
        int edges = sc.nextInt();
        while(edges-->0){
           int u = sc.nextInt();
           int v = sc.nextInt();
           graph.get(u).add(v);
           graph.get(v).add(u);
        }
        
        System.out.println("Enter the starting point:");
        int x =sc.nextInt();
        System.out.println("DFS of the Graph is :");
        dfsofGraph(x,graph,visited);
    }
    
}
