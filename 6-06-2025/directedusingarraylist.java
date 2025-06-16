import java.util.ArrayList;
import java.util.HashSet;

 public class Partice {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
         graph.addEdge(1,2);
         graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.printGraph();
    }
}
class Graph{
    ArrayList<ArrayList<Integer>>graph;
    int vertices;
    Graph(int vertices){
        this.vertices=vertices;
        this.graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<Integer>());
    }
    }
    void addEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }else{
            System.out.println("invalid source and destination");
        }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).remove(dest);
            graph.get(dest).remove(src);
        }else{
        System.err.println("invalid source and destination");
        }
    }
    public ArrayList<Integer>neighbours(int node){
        return graph.get(node);
    }
    boolean havingEdge(int src,int dest){
        if(isValid(src,dest)){
            var arr=graph.get(src);
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)==dest){
                    return true;
                }
            }
            return false;
        }
        System.out.println("Invalid source and destination.");
        return false;
    }
    boolean isValid(int src,int dest){
        return src>=0&&dest>=0&&src<vertices&&dest<vertices&&src!=dest;
    }
    
    void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.println(i+":"+graph.get(i));
        }
        
    }
}