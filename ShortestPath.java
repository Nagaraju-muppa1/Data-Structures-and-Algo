import java.util.*;
import java.util.Queue; 
public class ShortestPath {
    public static void bfsofGraph(int src,List<List<Integer>> graph,int[] dist){
          dist[src]=0;
          Queue<Integer> queue = new LinkedList<>();
          queue.add(src);
          while(!queue.isEmpty()){
           int x = queue.poll();
           for(int a:graph.get(x)){
              if(dist[x]+1 < dist[a]){
                queue.add(a);
                dist[a]=dist[x]+1;
              }
           }
          }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the graph:");
        int n = sc.nextInt();
        int dist[] = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
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
        bfsofGraph(x,graph,dist);
        System.out.println("Distance from the source:"+x);
        for(int a:dist){
            System.out.print(a+" ");
        }
    }
}
