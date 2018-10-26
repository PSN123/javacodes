package sortedset;

import java.util.LinkedList;
public class GFG {

static class Graph{
    int v; 
    LinkedList<Integer>akl[];
    Graph(int v){
    this.v=v;
    akl=new LinkedList[v];
    for(int i=0;i<v;i++){
        akl[i]=new LinkedList<>();
    }
    }
}
static void addEdge(Graph graph,int src,int dest){
    graph.akl[src].addFirst(dest);
    graph.akl[dest].addFirst(src);
}
    
static void pringraph(Graph graph){
    for(int v=0; v<graph.v;v++){
        System.out.println(""+v);
    for(Integer p:graph.akl[v]){
        System.out.println(""+p);
    }
        System.out.println("\n");
    
    }
    
    
}

 public static void main(String[] args) {
int v=5;
Graph graph=new Graph(v);
     addEdge(graph, 0, 1);
    addEdge(graph, 0, 4);
    addEdge(graph, 1, 2);
    addEdge(graph, 1, 3);
    addEdge(graph, 2, 3);
     pringraph(graph);
    
 
 
 }
    
}
