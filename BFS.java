import java.util.Queue;
import java.util.*;
public class BFS {
    public static void bfsofGraph(int start,List<List<Integer>> graph){
        int n=graph.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();  
        visited[start]=true;
        queue.add(start);
        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x+" ");
            for(int c:graph.get(x)){
                if(!visited[c]){
                    visited[c]=true;
                    queue.add(c);
                }
               
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the graph:");
        int n = sc.nextInt();
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
        bfsofGraph(0,graph);
    }
}
