package tadan;

import java.util.*;
import java.io.*;
import java.lang.*;

class tadan{
    
class Edge implements Comparable<Edge>{
int src,dest,weight;
        @Override
        public int compareTo(Edge compareEdge) {
    return this.weight-compareEdge.weight;
        }
};
    
        class sub{
            int parent,rank;
        };

int V,E;
Edge edge[];

tadan(int v,int e){
    V=v;
    E=e;
    edge=new Edge[e];
    for(int i=0; i<e;i++)
edge[i]=new Edge();
}
   
int find(sub subs[],int i){
    if(subs[i].parent!=i)
        subs[i].parent=find(subs, subs[i].parent);
    return subs[i].parent;
}

void union(sub subs[],int x, int y){
    int xroot=find(subs, x);
    int yroot=find(subs, y);
    
    if(subs[xroot].rank<subs[yroot].rank)
        subs[xroot].parent=yroot;
    else if(subs[xroot].rank>subs[yroot].rank)
        subs[yroot].parent=xroot;
    else{
        subs[xroot].parent=yroot;
        subs[yroot].rank++;
    }
    
}
void kruskalMSt(){
    int e=0;
    int i=0;
    Edge result[]=new Edge[V];
    for(i=0;i<V;i++)
        result[i]=new Edge();
    
    Arrays.sort(edge);
    
    sub subs[]=new sub[V];
       for(i=0;i<V;++i)
           subs[i]=new sub();
    
    for(int v=0;v<V; v++){
        subs[v].parent=v;
        subs[v].rank=0;
    }
    i=0;
    
    while(e<V-1){
        
        Edge next_edge=new Edge();
           next_edge=edge[e++];
        
           int x=find(subs, next_edge.src);
           int y=find(subs, next_edge.dest);
     
        if(x!=y){
          result[e++]=next_edge;
            union(subs, x, y);
           
       } 
        System.out.println(""); 
        
        for(i=0;i<e;i++)
            System.out.println(result[e].src+result[e].dest+result[e].weight);
        
    }
}

public static void main(String [] args){
int V=4;
int E=5;

tadan tk=new tadan(V, E);
    tk.edge[0].src=3;
    tk.edge[0].src=4;
    tk.edge[0].src=5;
    
    
    
    tk.kruskalMSt();
}

}
