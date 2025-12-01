import java.util.*;
public class TopoSort {
    public static void dfs(int x,List<List<Integer>> graph,boolean[] visited,Stack<Integer> stack){
        visited[x]=true;
        for(int a:graph.get(x)){
           if(!visited[a]){
            dfs(a,graph,visited,stack);
           }
          
        }
         stack.push(x);
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
           //graph.get(v).add(u);
        }
        
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            dfs(i,graph,visited,stack);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }
        System.out.print("Topological Sort: ");
        for (int node : ans) {
            System.out.print(node + " ");
        }
    }
}
