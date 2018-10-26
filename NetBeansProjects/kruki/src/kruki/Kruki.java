package kruki;
import java.lang.*;
import java.io.*;
import java.util.*;
public class Kruki {

   class Edge implements Comparable<Edge>{
       int src,dest,weight;

        @Override
        public int compareTo(Edge compareEdge) {
       return this.weight-compareEdge.weight;
        };
      }
   class sub{
       int parent,rank;
       
   };
   int V,E;
   Edge edge[];
   
   Kruki(int v,int e){
       V=e;
       E=e;
       edge= new Edge[e];
         for(int i=0;i<V;++i)
            edge[i]=new Edge();
     }
   int find(sub subs[],int i){
    if(subs[i].parent!=i)
       subs[i].parent=find(subs, subs[i].parent);
    return subs[i].parent;
        }
  void Union(sub subs[],int x,int y){
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
   void kruskalMST(){
      Edge result[]=new Edge[V];
       int e=0;
       int i=0;
       for(i=0;i<V;++i)
           result[i]=new  Edge();
   
   Arrays.sort(edge);
   
   sub subs[]=new sub[V];
   for(i=0;i<V;++i)
       subs[i]= new sub();
   
   for(int v=1; v<V; ++v){
       subs[v].parent=v;
       subs[v].rank=0;
   }
   i=0;
  
  while(e<V-1){
    Edge next_edge=new Edge();
        next_edge=edge[i++];
        
        int x=find(subs, next_edge.src);
        int y=find(subs,next_edge.dest);
        
}  
   }
    public static void main(String[] args) {
   int v=4;
   int e=5;
   
  Kruki k=new Kruki(v, e);
    
    k.kruskalMST();
    }
    
}
