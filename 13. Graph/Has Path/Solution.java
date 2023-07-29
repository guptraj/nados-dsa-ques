class Solution {
    public class Edge{
            int src;
            int nbr;
            Edge(int src,int nbr){
                this.src=src;
                this.nbr=nbr;
            }
    }
    public void addEdge(ArrayList<Edge>[] graph, int u,int v){
        graph[u].add(new Edge(u,v));
        graph[v].add(new Edge(v,u));
    }
    public boolean helper(ArrayList<Edge>[] graph , int src , int dest, boolean [] arr){
        if(src==dest) return true;
        arr[src]=true;
        for(Edge e : graph[src]){
            if(!arr[e.nbr]){
                if(helper(graph,e.nbr,dest,arr)) return true;
            }
        }
        arr[src]=false;
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Edge> [] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            addEdge(graph,edges[i][0],edges[i][1]);
        }
        boolean [] arr = new boolean[n];
        boolean ans = helper(graph,source,destination,arr);
        return ans;
        
    }
}