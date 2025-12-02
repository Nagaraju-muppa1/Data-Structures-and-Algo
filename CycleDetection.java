import java.util.*;
import java.util.Queue;
import java.util.LinkedList; 

public class CycleDetection {
    public static void bfs(ArrayList<Integer> ans,int[] indegeer,List<List<Integer>> graph){
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<indegeer.length;i++){
            if(indegeer[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
             int x = queue.poll();
             ans.add(x);
             for(int a:graph.get(x)){
                indegeer[a]--;
                if(indegeer[a]==0){
                    queue.add(a);
                }
             }
         }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the graph:");
        int n = sc.nextInt();
        int[] indegeer = new int[n];
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
           indegeer[v]++;
           //graph.get(v).add(u);
        }
        // System.out.println("Indegrees of the graph:");
        // for(int a:indegeer){
        //     System.out.print(a+" ");
        // }
        ArrayList<Integer> ans = new ArrayList<>();
        bfs(ans,indegeer,graph);
        if(ans.size() < n){
            System.out.println("Graph contains cycle.");
        }
        else{
            System.out.println("Graph does not contains cycle");
        }
    }
}
