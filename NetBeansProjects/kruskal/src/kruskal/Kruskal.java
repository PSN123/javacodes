package kruskal;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Kruskal {
 
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
    int V,E; // V stands for vertics(cornor of graph) and E Edge stands for connetion between 2 edges 
    Edge edge[];

    Kruskal(int v, int e) {
   V=v;
   E=e;
  edge=new Edge[E];
for(int i=0;i<e;++i)
    edge[i]=new Edge();
    }
    
int find(sub subs[],int i){
 if(subs[i].parent!=i)
     subs[i].parent=find(subs, subs[i].parent);
return subs[i].parent;
}    

void union(sub subs[],int x ,int y){
 int xroot=find(subs, x);
 int yroot=find(subs, y);
 
if(subs[xroot].rank<subs[yroot].rank)
    subs[xroot].parent=yroot;
else if(subs[xroot].rank>subs[yroot].rank)
    subs[yroot].rank=xroot;
else{
    subs[xroot].parent=yroot;
    subs[yroot].rank++;
}
}
    void kruskalMST(){
        Edge result[]=new Edge[V];
    int e=0;
        int i=0;
        for(i=0;i<V;i++)
            result[i]=new Edge();
  
    Arrays.sort(edge);
    
    sub subs[]=new sub[i];
    for(i=0;i<V;i++)
        subs[i]=new sub();
    
for(int v=0; v<V; ++v)
{
 subs[v].parent=v;
 subs[v].rank=0;
}    
i=0;

while(e<V-1){
Edge next_edge=new Edge();
next_edge=edge[i++];

int x=find(subs, next_edge.src);
int y=find(subs, next_edge.dest);

if(x!=y){
    
result[e++]=next_edge;
    union(subs, x, y);
}

    System.out.println("");

for(i=0;i<e;i++){
    System.out.println(result[e].src+"-->"+result[e].dest+"=="+result[e].weight);
}
    
}
}    
    
    
    public static void main(String[] args) {
int v=5;
int e=4;
         Kruskal k=new Kruskal(v, e);
     
         k.edge[0].src=1;
         
         
         
         k.kruskalMST();
    }
    
}
