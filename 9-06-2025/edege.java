import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4, false);
        graph.addEdge(0, 3);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(3, 2);

        graph.printGraph();
    }
}

class Edge {
    int src;
    int dest;
    int weight;

    Edge(int src, int dest) {
        this(src, dest, 1); 
    }

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }


   public boolean equals(Object obj) {
 if (this == obj) return true;
        if (!(obj instanceof Edge)) return false;
Edge other = (Edge) obj;
return src == other.src && dest == other.dest && weight == other.weight;
    }


  public int hashCode() {
return Objects.hash(src, dest, weight);
    }

 public String toString() {
return src + " -> " + dest + " (weight=" + weight + ")";
    }
}

class Graph {
    HashSet<Edge> graph;
    int vertices;
    boolean isDirected;

    Graph(int vertices) {
        this(vertices, false);
    }

    Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        this.graph = new HashSet<>();
    }

    public void addEdge(int src, int dest) {
        addEdge(src, dest, 1);
    }

    public void addEdge(int src, int dest, int weight) {
        if (isValid(src, dest)) {
            Edge e1 = new Edge(src, dest, weight);
            graph.add(e1);
            if (!isDirected) {
                Edge e2 = new Edge(dest, src, weight);
                graph.add(e2);
            }
        } else {
            System.out.println("Invalid edge: " + src + " -> " + dest);
        }
    }

    public boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }

    public void printGraph() {
        System.out.println("Edges in the graph:");
        for (Edge e : graph) {
            System.out.println(e);
        }
    }
}
