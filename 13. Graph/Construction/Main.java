public class Main {
    public static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }

        Edge() {
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        graph[u].add(new Edge(u, v, w));
        graph[v].add(new Edge(v, u, w));
    }
    public static void main(Strings [] args){
        ArrayList<Edge>[] graph = new ArrayList<>[7];
        for (int i = 0; i < 7; i++) {
            graph[i] = new ArrayList<>();
        }
        addEdge()

    }
}