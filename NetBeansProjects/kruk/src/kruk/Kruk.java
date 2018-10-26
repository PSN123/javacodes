package kruk;
 
import java.util.*;
import java.lang.*;
import java.io.*;


class Kruk{

class Edge implements Comparable<Edge>{
    int src,dest,weight;
    @Override
        public int compareTo(Edge comEdge) {
      return this.weight-comEdge.weight;
        }
        };

    class sub{
        int parent,rank;
    };
int V,E; // v stands for vertics E stands  Edgess
Edge edge[];

Kruk(int v,int e){
  V=v;
  E=e;
  edge =new Edge[e];
  for(int i=0;i<e;++i)
      edge [i]=new Edge();
}
int find(sub subs[],int i){
    if(subs[i].parent!=i)
        subs[i].parent=find(subs, subs[i].parent);
    return subs[i].parent;
}

void union(sub subs[], int x,int y){
    
int xroot=find(subs, x);
int yroot=find(subs, y);

if(subs[xroot].rank<subs[yroot].rank)
    subs[xroot].parent=yroot;
else if(subs[xroot].rank>subs[yroot].rank)
    subs[xroot].parent=xroot; 
else{
    subs[xroot].parent=yroot;
    subs[yroot].rank++;
}
}

void KruskalMST(){
    Edge result[]=new Edge[V];
    int e=0;
    int i=0;
for(i=0;i<V;++i)
    result[i]=new Edge();


Arrays.sort(edge);

sub subs[]=new sub[V];
for( i=0; i<V; ++i)
    subs[i]=new sub();

  for(int v=0; v<V; ++v){
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
    
}
    System.out.println("following are the edges in"+"the constructed MST");
for(i=0;i<e;++i)
        System.out.println(result[i].src+"___"+result[i].dest+"=="+result[i].weight);

}


public static void main(String [] args){
    int V=4;
    int E=5;
    
    Kruk ku=new Kruk(V, E);
    ku.edge[0].src=0;
    ku.edge[0].dest=1;
    ku.edge[0].weight=10;

    ku.edge[1].src=0;
    ku.edge[1].dest=2;
    ku.edge[1].weight=6;

    ku.edge[2].src=0;
    ku.edge[2].dest=3;
    ku.edge[2].weight=5;

    ku.edge[3].src=1;
    ku.edge[3].dest=3;
    ku.edge[3].weight=15;

   
    ku.edge[4].src=2;
    ku.edge[4].dest=3;
    ku.edge[4].weight=4;

    
    ku.KruskalMST();
}

     
    }


